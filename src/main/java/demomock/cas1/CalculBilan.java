package demomock.cas1;

import java.time.LocalDate;
import java.util.List;

public class CalculBilan {

    private IOperationDao operationDao;

    public CalculBilan(IOperationDao operationDao) {
        this.operationDao = operationDao;
    }

    public double calculerBilanMensuel() {

        List<Operation> operations = operationDao.getOperations();
        if (operations.size() <= 2){
            Algorithme algo = new AlgorithmePetitVolume(operations);
            return algo.calculer();
        }
        else {
            Algorithme algo = new AlgorithmeVolumeNormal(operations);
            return algo.calculer();
        }
    }

    public double calculerBilanMensuel(int mois) throws OperationException {

        List<Operation> operations = operationDao.getOperations(mois);
        if (operations.size() <= 2){
            Algorithme algo = new AlgorithmePetitVolume(operations);
            return algo.calculer();
        }
        else {
            Algorithme algo = new AlgorithmeVolumeNormal(operations);
            return algo.calculer();
        }
    }

    public double calculerBilanMensuel(LocalDate dateDebut, LocalDate dateFin) {

        List<Operation> operations = operationDao.getOperations(dateDebut, dateFin);
        if (operations.size() <= 2){
            Algorithme algo = new AlgorithmePetitVolume(operations);
            return algo.calculer();
        }
        else {
            Algorithme algo = new AlgorithmeVolumeNormal(operations);
            return algo.calculer();
        }
    }

    public void deleteOperation(Long id) throws OperationException {
        Operation ope = operationDao.findById(id);
        operationDao.deleteOperation(ope);
    }
}
