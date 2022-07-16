import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import labs.lab3.*;

public class Lab3Test {
    @Test
    public void test_problem1() {
        Main tester = new Main();
        assertEquals("aba", tester.problem1_mirrorEnds("aba"));
    }

    @Test
    public void test_problem2() {
        Main tester = new Main();
        assertEquals(44, tester.problem2_sumNumbers("aa11b33"));
    }

    @Test
    public void test_problem3() {
        Main tester = new Main();
        assertEquals("is not-is not", tester.problem3_notReplace("is-is"));
    }

    @Test
    public void test_problem4() {
        CreditCard cc = new CreditCard(4012888888881881L);
        assertEquals(4012888888881881L, cc.getNumber());
        assertEquals("4012 8888 8888 1881", cc.getNumberWithSpaces());
        assertEquals(true, cc.isValid());
    }

    @Test
    public void test_problem5() {
        Main tester = new Main();
        assertEquals(4, tester.problem5_getNumTwists(0000, 9999));
    }

    @Test
    public void test_problem6() {
        Main tester = new Main();
        assertArrayEquals(new int [] {2, 3, 3},
                tester.problem6_evenOdd(new int [] {3, 3, 2}));
    }

    @Test
    public void test_problem7() {
        ArrayBarChart chart = new ArrayBarChart(new int[] {8, 8, 3, 3, 1, 0, 2, 4, 12});
        assertEquals(7, chart.getNumAsterisks(0));
        assertEquals(3, chart.getNumAsterisks(2));
        assertEquals(0, chart.getNumAsterisks(5));
    }

    @Test
    public void test_problem8() {
        int [][] nums1 = {
                { 16, 3, 2, 13 },
                { 5, 10, 11, 8 },
                { 9, 6, 7, 12 },
                { 4, 15, 14, 1 }
        };
        Square s1 = new Square(nums1);
        assertEquals(34, s1.rowSum(0));
        assertEquals(34, s1.rowSum(3));
        assertEquals(34, s1.columnSum(1));
        assertEquals(34, s1.columnSum(2));
        assertEquals(34, s1.diagonalSum(true));
        assertEquals(true, s1.isMagic());
    }

    @Test
    public void test_problem9() {
        Item treats = new Item(2.5, true, 10);
        Item collar = new Item(15.75, false, 1);
        Item dogShampoo = new Item(9, false, 2);
        Item bones = new Item(6.25, true, 5);
        Invoice myInvoice = new Invoice();
        myInvoice.addItem(treats);
        myInvoice.addItem(collar);
        myInvoice.addItem(dogShampoo);
        myInvoice.addItem(bones);
        assertEquals(84.375, myInvoice.getTotal());
    }

    @Test
    public void test_problem10() {
        PetStore myStore = new PetStore();
        Customer emily = new Customer("Emily");
        emily.addSale(55.33);
        emily.addSale(.99);
        Customer adriana = new Customer("Adriana");
        adriana.addSale(89.30);
        adriana.addSale(9.99);
        Customer anupriya = new Customer("Anupriya");
        anupriya.addSale(101.54);
        Customer rujun = new Customer("Rujun");
        rujun.addSale(55.33);
        rujun.addSale(.99);
        rujun.addSale(55.33);
        rujun.addSale(10.99);
        Customer yizhen = new Customer("Yizhen");
        yizhen.addSale(.33);
        yizhen.addSale(.99);
        yizhen.addSale(121.09);
        myStore.addCustomer(emily);
        myStore.addCustomer(adriana);
        myStore.addCustomer(anupriya);
        myStore.addCustomer(rujun);
        myStore.addCustomer(yizhen);
        assertEquals("Rujun", myStore.getNameOfBestCustomer());
    }
}
