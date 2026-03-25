package samuelvalentini;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import samuelvalentini.dao.EventoDAO;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4d12ex");


    public static void main(String[] args) {
        EntityManager entityManager = emf.createEntityManager();
        EventoDAO eventoDAO = new EventoDAO(entityManager);

        System.out.println("Hello World!");
//        Evento ev1 = new Evento("Festa grande", LocalDate.of(2026, 3, 25), "la festa dell'anno", TipoEvento.PUBBLICO, 20000);
//        Evento ev2 = new Evento("Festa tonica", LocalDate.of(2026, 6, 25), "la festa più tonica dell'estate", TipoEvento.PRIVATO, 3000);
//        Evento ev3 = new Evento("Festa miscela", LocalDate.of(2026, 11, 25), "miscelati con i migliori", TipoEvento.MISTO, 3000);

//
//        eventoDAO.save(ev1);
//        eventoDAO.save(ev2);
//        eventoDAO.save(ev3);
////
//        try {
//            Evento ev1FromDatabase = eventoDAO.getById(UUID.fromString("31022b18-cd47-4a5d-a74d-94dc5002c014"));
//            System.out.println(ev1FromDatabase);
//        } catch (NotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        try {
//            eventoDAO.deleteById(UUID.fromString("31022b18-cd47-4a5d-a74d-94dc5002c014"));
//        } catch (NotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }


    }


}
