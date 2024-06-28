package goral;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorServiceTest {

    @Mock private TaskManagementSystem taskManagementSystem;

    private SalaryCalculatorService salaryCalculatorService;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
        salaryCalculatorService = new SalaryCalculatorService(taskManagementSystem);
    }

    @Test
    public void shouldHaveNoBonus() {
        // given
        Employee employee = new Employee("Tomek", BigDecimal.valueOf(2000));
        Mockito.when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(9);

        // when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        // then
        assertThat(salary).isEqualTo(BigDecimal.valueOf(2000));

    }

    @Test
    public void shouldReturnExtra1000(){
        TaskManagementSystem taskManagementSystem = Mockito.mock(TaskManagementSystem.class);



    }

}