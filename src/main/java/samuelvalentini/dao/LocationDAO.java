package samuelvalentini.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import samuelvalentini.entities.Location;
import samuelvalentini.exceptions.NotFoundException;
import samuelvalentini.exceptions.NotSavedException;

import java.util.UUID;

public class LocationDAO {

    private final EntityManager entityManager;

    public LocationDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public void save(Location newLocation) {
        try {
            EntityTransaction transaction = this.entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(newLocation);
            transaction.commit();
            System.out.println("La location " + newLocation.getNomeLocation() + " è stata salvata con successo!");
        } catch (Exception e) {
            throw new NotSavedException(newLocation);
        }

    }

    public Location getById(UUID idLocation) {
        Location found = entityManager.find(Location.class, idLocation);
        if (found == null) throw new NotFoundException(idLocation);
        return found;

    }

//    public void deleteById(UUID idEvento) {
//        Evento found = this.getById(idEvento);
//        EntityTransaction transaction = this.entityManager.getTransaction();
//        transaction.begin();
//        entityManager.remove(found);
//        transaction.commit();
//        System.out.println("L'evento " + found.getTitolo() + " è stato eliminato con successo!");
//
//    }
}
