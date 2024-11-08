package demomock.cas1;

import java.time.LocalDate;
import java.util.List;

public interface IOperationDao {
    List<Operation> getOperations();
    List<Operation> getOperations(int mois) throws OperationException;
    List<Operation> getOperations(LocalDate dateDebut, LocalDate dateFin);
    void deleteOperation(Operation ope) throws OperationException;

    Operation findById(Long id);
}
