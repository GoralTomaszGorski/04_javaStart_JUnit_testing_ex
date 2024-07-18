package goral;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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

    @ValueSource(ints = {10, 19})
    @ParameterizedTest
    public void shouldReturnExtra500(int finishedTasks){

        // given
        Employee employee = new Employee("Adam", BigDecimal.valueOf(2500));
        Mockito.when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(finishedTasks);

        // when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        // then
        assertThat(salary).isEqualTo(BigDecimal.valueOf(3000));



    }

    @ValueSource(ints = {20,21})
    @ParameterizedTest
    public void shouldReturnExtra1000(int finishedTasks){

        // given
        Employee employee = new Employee("Kasia", BigDecimal.valueOf(2000));
        Mockito.when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(finishedTasks);

        // when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        // then
        assertThat(salary).isEqualTo(BigDecimal.valueOf(3000));
    }

}