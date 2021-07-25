package cabinvoicegenerator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {

    InvoiceGenerator cabInvoiceGenerator = new InvoiceGenerator();

    @Test
    public void givenDistanceAndTime_WhenCalculated_ReturnTotalFare()
    {
        double cabInvoiceGeneratorTotalFare = cabInvoiceGenerator.getTotalFare(5.0, 5);
        Assert.assertEquals(55.0, cabInvoiceGeneratorTotalFare, 0);
    }

    @Test
    public void givenDistanceAndTime_WhenLessThanMinimumFareGetCalculated_ThenReturnMinimumFare() 
    {
        double cabInvoiceGeneratorTotalFare = cabInvoiceGenerator.getTotalFare(0.132, 1);
        Assert.assertEquals(5, cabInvoiceGeneratorTotalFare, 0);
    }
}