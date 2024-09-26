/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Paciente;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;


public class PacienteDAOImpTest {
    
    @Mock
    private EntityManager entityManager;

    @Mock
    private EntityTransaction transaction;

    @InjectMocks
    private PacienteDAOImp pacienteDAO;
    
    public PacienteDAOImpTest() {
    }
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this); // Inicializa os mocks
        when(entityManager.getTransaction()).thenReturn(transaction); // Simula a transação
    }

    @Test
    public void testSavePaciente() {
        Paciente paciente = new Paciente();
        paciente.setNome("João");
        paciente.setCpf("12345678901");

        pacienteDAO.save(paciente);

        verify(entityManager, times(1)).persist(paciente); // Verifica se o método persist foi chamado uma vez
        verify(transaction, times(1)).begin();             // Verifica se a transação começou
        verify(transaction, times(1)).commit();            // Verifica se a transação foi comitada
    }

    @Test
    public void testUpdatePaciente() {
        Paciente paciente = new Paciente();
        paciente.setNome("Maria");
        paciente.setCpf("98765432101");

        pacienteDAO.update(paciente);

        verify(entityManager, times(1)).merge(paciente);   // Verifica se o método merge foi chamado
        verify(transaction, times(1)).begin();
        verify(transaction, times(1)).commit();
    }

    @Test
    public void testDeletePaciente() {
        Paciente paciente = new Paciente();
        when(entityManager.contains(paciente)).thenReturn(true); // Simula que o paciente está presente no contexto

        Boolean result = pacienteDAO.delete(paciente);

        assertTrue(result);                                   // Verifica se o retorno foi verdadeiro
        verify(entityManager, times(1)).remove(paciente);     // Verifica se o método remove foi chamado
        verify(transaction, times(1)).begin();
        verify(transaction, times(1)).commit();
    }

    @Test
    public void testFindById() {
        Paciente paciente = new Paciente();
        paciente.setId(1L);
        when(entityManager.find(Paciente.class, 1)).thenReturn(paciente); // Simula a busca

        Paciente foundPaciente = pacienteDAO.findById(1);

        assertNotNull(foundPaciente);                           // Verifica se o paciente foi encontrado
        assertEquals(1L, foundPaciente.getId());
    }

    @Test
    public void testFindAll() {
        Paciente paciente1 = new Paciente();
        paciente1.setNome("Paciente 1");

        Paciente paciente2 = new Paciente();
        paciente2.setNome("Paciente 2");

        List<Paciente> pacientes = Arrays.asList(paciente1, paciente2);
        when(entityManager.createQuery("SELECT p FROM Paciente p", Paciente.class).getResultList())
                .thenReturn(pacientes); // Simula a consulta

        List<Paciente> result = pacienteDAO.findAll();

        assertEquals(2, result.size());                       // Verifica se retornou dois pacientes
        assertEquals("Paciente 1", result.get(0).getNome());
        assertEquals("Paciente 2", result.get(1).getNome());
    }
}
