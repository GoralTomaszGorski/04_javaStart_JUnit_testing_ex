package goral;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SmartHomeControllerTest {

    @Mock  HumiditySensor humiditySensor;
    @Mock  WateringController wateringController;

    private SmartHomeController smartHomeController;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
        smartHomeController = new SmartHomeController(humiditySensor, wateringController);
    }

    @Test
    public void shouldDisableWatering(){

        //given
        Mockito.when(humiditySensor.getHumidity()).thenReturn(50);

        //when
        smartHomeController.enableWateringIfNeeded();

        // then
        verify(wateringController).disableWatering();
    }

    @Test
    public void shouldEnableWatering(){

        //given
        Mockito.when(humiditySensor.getHumidity()).thenReturn(49);

        //when
        smartHomeController.enableWateringIfNeeded();

        // then
        verify(wateringController).enableWatering();
    }
}