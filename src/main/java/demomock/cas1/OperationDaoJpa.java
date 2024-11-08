package demomock.cas1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.time.LocalDate;
import java.util.List;

public class OperationDaoJpa implements IOperationDao {

    private EntityManager entityManager;

    @Override
    public List<Operation> getOperations() {
        return List.of();
    }

    @Override
    public List<Operation> getOperations(int mois) throws OperationException {
        return List.of();
    }

    @Override
    public List<Operation> getOperations(LocalDate dateDebut, LocalDate dateFin) {

        TypedQuery<Operation> query = entityManager.createQuery("FROM Operation WHERE ...", Operation.class);
        return query.getResultList();
    }

    @Override
    public void deleteOperation(Operation ope) throws OperationException {

    }

    @Override
    public Operation findById(Long id) {
        return null;
    }
}
