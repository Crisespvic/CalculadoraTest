package CalculadoraJunit;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 * Classe per testar el correcte funcionament de les funcions de la calculadora
 * @author Cristian
 */
public class CalculadoraTest {
    
    Calculadora calculadora;
    
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String horaFormatejada = hora.format(formatter);
        System.out.println(horaFormatejada+"---->Inici del test");
    }
    
    @AfterAll
    public static void tearDownClass() {
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String horaFormatejada = hora.format(formatter);
        System.out.println(horaFormatejada+"---->Fi del test");
    }
    
    @BeforeEach
    public void setUp() {
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String horaFormatejada = hora.format(formatter);
        System.out.println(horaFormatejada+"---->Inici de la prova");
        calculadora=new Calculadora();
    }
    
    @AfterEach
    public void tearDown() {
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String horaFormatejada = hora.format(formatter);
        System.out.println(horaFormatejada+"---->Fi de la prova");
        calculadora.restablecer();
    }

    @Test
    public void testSuma(){
        System.out.println("\tPROVA SUMA");
        float op1=2.0f;
        float op2=3.0f;
        float resultat;
        resultat = calculadora.suma(op1,op2);
        float esperat= 5.0f;
        assertEquals(esperat, resultat);
    }
    
    @Test
    public void testResta(){
        System.out.println("\tPROVA RESTA");
        float op1=2.0f;
        float op2=3.0f;
        float resultat;
        resultat = calculadora.resta(op1,op2);
        float esperat= -1.0f;
        assertEquals(esperat, resultat);
    }
    
    @Test
    public void testMultiplica(){
        System.out.println("\tPROVA MULTIPLICA");
        float op1=2.0f;
        float op2=3.0f;
        float resultat;
        resultat = calculadora.multiplica(op1,op2);
        float esperat= 6.0f;
        assertEquals(esperat, resultat);
    }
    
    @Test
    public void testDivideix(){
        System.out.println("\tPROVA DIVIDEIX");
        float op1=3.0f;
        float op2=2.0f;
        float resultat;
        resultat = calculadora.divideix(op1,op2);
        float esperat= 1.5f;
        assertEquals(esperat, resultat);
    }
    
    @Test
    public void testMajorQue(){
        System.out.println("\tPROVA MAJOR QUE");
        float op1=2.0f;
        float op2=3.0f;
        boolean resultat;
        resultat = calculadora.majorQue(op1,op2);
        boolean esperat= false;
        assertEquals(esperat, resultat);
    }
}
