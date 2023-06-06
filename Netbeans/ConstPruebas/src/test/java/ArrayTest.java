
import java.lang.reflect.Array;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayTest {
    @Test
    public void testSize() {

        int arr[] = {1,2,3};
        Array a = new Array(arr);
        assertEquals(3,a.size());

    }
    @Test
    public void testToString(){

        int arr[] = {1,2,3};
        Array a = new Array(arr);
        assertEquals("1,2,3", a.toString());

        
    }
    @Test
    public void testSetElementAr(){    
    }

}