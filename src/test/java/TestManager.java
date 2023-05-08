import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestManager {
    @Test
    public void testAdd() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Ticket ticket1 = new Ticket(1, 889, "SVO", "HKT", 600);
        Ticket ticket2 = new Ticket(2, 1890, "SVO", "HKT", 550);
        Ticket ticket3 = new Ticket(3, 555, "SVO", "HKT", 700);
        Ticket ticket4 = new Ticket(4, 955, "SVO", "HKT", 750);
        Ticket ticket5 = new Ticket(5, 1200, "SVO", "HKT", 640);
        Ticket ticket6 = new Ticket(6, 3999, "SVO", "HKT", 900);
        Ticket ticket7 = new Ticket(7, 2500, "SVO", "HKT", 810);
        Ticket ticket8 = new Ticket(11, 18066, "VKO", "OMK", 800);
        Ticket ticket9 = new Ticket(21, 1460, "SVO", "HKT", 500);
        Ticket ticket10 = new Ticket(15, 1600, "NEW", "SPB", 1000);
        Ticket ticket11 = new Ticket(16, 800, "NEW", "SPB", 900);
        Ticket ticket12 = new Ticket(17, 954, "NEW", "SPB", 990);
        Ticket ticket13 = new Ticket(31, 5000, "SVO", "NEW", 1200);
        Ticket ticket14 = new Ticket(32, 3460, "SVO", "NEW", 800);
        Ticket ticket15 = new Ticket(25, 2889, "SVO", "OMK", 760);
        Ticket ticket16 = new Ticket(19, 1800, "SVO", "HKT", 800);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);
        manager.add(ticket13);
        manager.add(ticket14);
        manager.add(ticket15);
        manager.add(ticket16);

        Ticket[] expected = {ticket3, ticket1, ticket4, ticket5, ticket9, ticket16, ticket2, ticket7, ticket6};
        Ticket[] actual = manager.findAll("SVO", "HKT");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testOneTicket() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Ticket ticket1 = new Ticket(1, 889, "SVO", "HKT", 600);
        Ticket ticket2 = new Ticket(2, 1890, "SVO", "HKT", 550);
        Ticket ticket3 = new Ticket(3, 555, "SVO", "HKT", 700);
        Ticket ticket4 = new Ticket(4, 955, "SVO", "HKT", 750);
        Ticket ticket5 = new Ticket(5, 1200, "SVO", "HKT", 640);
        Ticket ticket6 = new Ticket(6, 3999, "SVO", "HKT", 900);
        Ticket ticket7 = new Ticket(7, 2500, "SVO", "HKT", 810);
        Ticket ticket8 = new Ticket(11, 18066, "VKO", "OMK", 800);
        Ticket ticket9 = new Ticket(21, 1460, "SVO", "HKT", 500);
        Ticket ticket10 = new Ticket(15, 1600, "NEW", "SPB", 1000);
        Ticket ticket11 = new Ticket(16, 800, "NEW", "SPB", 900);
        Ticket ticket12 = new Ticket(17, 954, "NEW", "SPB", 990);
        Ticket ticket13 = new Ticket(31, 5000, "SVO", "NEW", 1200);
        Ticket ticket14 = new Ticket(32, 3460, "SVO", "NEW", 800);
        Ticket ticket15 = new Ticket(25, 2889, "SVO", "OMK", 760);
        Ticket ticket16 = new Ticket(19, 1800, "SVO", "HKT", 800);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);
        manager.add(ticket13);
        manager.add(ticket14);
        manager.add(ticket15);
        manager.add(ticket16);

        Ticket[] expected = {ticket8};
        Ticket[] actual = manager.findAll("VKO", "OMK");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoOneTicket() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Ticket ticket1 = new Ticket(1, 889, "SVO", "HKT", 600);
        Ticket ticket2 = new Ticket(2, 1890, "SVO", "HKT", 550);
        Ticket ticket3 = new Ticket(3, 555, "SVO", "HKT", 700);
        Ticket ticket4 = new Ticket(4, 955, "SVO", "HKT", 750);
        Ticket ticket5 = new Ticket(5, 1200, "SVO", "HKT", 640);
        Ticket ticket6 = new Ticket(6, 3999, "SVO", "HKT", 900);
        Ticket ticket7 = new Ticket(7, 2500, "SVO", "HKT", 810);
        Ticket ticket8 = new Ticket(11, 18066, "VKO", "OMK", 800);
        Ticket ticket9 = new Ticket(21, 1460, "SVO", "HKT", 500);
        Ticket ticket10 = new Ticket(15, 1600, "NEW", "SPB", 1000);
        Ticket ticket11 = new Ticket(16, 800, "NEW", "SPB", 900);
        Ticket ticket12 = new Ticket(17, 954, "NEW", "SPB", 990);
        Ticket ticket13 = new Ticket(31, 5000, "SVO", "NEW", 1200);
        Ticket ticket14 = new Ticket(32, 3460, "SVO", "NEW", 800);
        Ticket ticket15 = new Ticket(25, 2889, "SVO", "OMK", 760);
        Ticket ticket16 = new Ticket(19, 1800, "SVO", "HKT", 800);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);
        manager.add(ticket13);
        manager.add(ticket14);
        manager.add(ticket15);
        manager.add(ticket16);

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("SVO", "SPB");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTicket() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Ticket ticket1 = new Ticket(1, 600, "SVO", "HKT", 600);
        Ticket ticket2 = new Ticket(2, 650, "SVO", "HKT", 550);
        Ticket ticket3 = new Ticket(3, 700, "SVO", "HKT", 700);
        Ticket ticket4 = new Ticket(4, 750, "SVO", "HKT", 750);
        Ticket ticket5 = new Ticket(5, 800, "SVO", "HKT", 640);
        Ticket ticket6 = new Ticket(6, 850, "SVO", "HKT", 900);
        Ticket ticket7 = new Ticket(7, 900, "SVO", "HKT", 810);
        Ticket ticket8 = new Ticket(11, 18066, "VKO", "OMK", 800);
        Ticket ticket9 = new Ticket(21, 950, "SVO", "HKT", 500);
        Ticket ticket10 = new Ticket(15, 1600, "NEW", "SPB", 1000);
        Ticket ticket11 = new Ticket(16, 800, "NEW", "SPB", 900);
        Ticket ticket12 = new Ticket(17, 954, "NEW", "SPB", 990);
        Ticket ticket13 = new Ticket(31, 5000, "SVO", "NEW", 1200);
        Ticket ticket14 = new Ticket(32, 3460, "SVO", "NEW", 800);
        Ticket ticket15 = new Ticket(25, 2889, "SVO", "OMK", 760);
        Ticket ticket16 = new Ticket(19, 1000, "SVO", "HKT", 800);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);
        manager.add(ticket13);
        manager.add(ticket14);
        manager.add(ticket15);
        manager.add(ticket16);

        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket9, ticket16};
        Ticket[] actual = manager.findAll("SVO", "HKT");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortComparatorTicket() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Ticket ticket1 = new Ticket(1, 600, "SVO", "HKT", 600);
        Ticket ticket2 = new Ticket(2, 650, "SVO", "HKT", 550);
        Ticket ticket3 = new Ticket(3, 700, "SVO", "HKT", 700);
        Ticket ticket4 = new Ticket(4, 750, "SVO", "HKT", 750);
        Ticket ticket5 = new Ticket(5, 800, "SVO", "HKT", 640);
        Ticket ticket6 = new Ticket(6, 850, "SVO", "HKT", 900);
        Ticket ticket7 = new Ticket(7, 900, "SVO", "HKT", 810);
        Ticket ticket8 = new Ticket(11, 18066, "VKO", "OMK", 800);
        Ticket ticket9 = new Ticket(21, 950, "SVO", "HKT", 500);
        Ticket ticket10 = new Ticket(15, 1600, "NEW", "SPB", 1000);
        Ticket ticket11 = new Ticket(16, 800, "NEW", "SPB", 900);
        Ticket ticket12 = new Ticket(17, 954, "NEW", "SPB", 990);
        Ticket ticket13 = new Ticket(31, 5000, "SVO", "NEW", 1200);
        Ticket ticket14 = new Ticket(32, 3460, "SVO", "NEW", 800);
        Ticket ticket15 = new Ticket(25, 2889, "SVO", "OMK", 760);
        Ticket ticket16 = new Ticket(19, 1000, "SVO", "HKT", 800);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);
        manager.add(ticket13);
        manager.add(ticket14);
        manager.add(ticket15);
        manager.add(ticket16);

        Ticket[] expected = {ticket9,ticket2, ticket1, ticket5, ticket3, ticket4, ticket16, ticket7, ticket6 };
        Ticket[] actual = manager.findAll("SVO", "HKT", new TicketByDurationAscComparator());
        Assertions.assertArrayEquals(expected, actual);
    }

}
