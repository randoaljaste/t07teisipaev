package kabe;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
   KabeLaud laud=new RandoKabeLaud();
   @Test
   public void test1(){
      assertEquals(3, 1+2);
   }
   @Test
   public void test2(){
	   assertEquals(0, laud.veergKoodiks('A'));
	   assertEquals(7, laud.veergKoodiks('H'));
   }
}