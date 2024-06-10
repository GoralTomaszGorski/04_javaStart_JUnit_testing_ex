package goral;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class SmartHomeControllerTest {

    @Mock  HumiditySensor humiditySensor;
    @Mock  WateringController wateringController;


    @InjectMocks
    private SmartHomeController smartHomeController;

//    @BeforeEach
//    public void init(){
//        smartHomeController = new SmartHomeController(humiditySensor, wateringController);
//    }

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