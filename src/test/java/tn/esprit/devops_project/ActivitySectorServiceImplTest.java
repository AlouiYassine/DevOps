package tn.esprit.devops_project;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.devops_project.entities.ActivitySector;
import tn.esprit.devops_project.services.Iservices.IActivitySector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
public class ActivitySectorServiceImplTest {
    @Autowired
    private IActivitySector activitySector;
    @Test
    void testAddActivitySector(){
        log.info("Testing addActivitySector methode");
        ActivitySector a=new ActivitySector();
        a.setCodeSecteurActivite("11111");
        a.setLibelleSecteurActivite("IT service");
        ActivitySector savedactivty=activitySector.addActivitySector(a);
        assertNotNull(savedactivty.getIdSecteurActivite());
        assertEquals(a.getCodeSecteurActivite(),savedactivty.getCodeSecteurActivite());
        log.info("Finished testing addActivitySector methode");
        log.info("delete activity after the test");
        activitySector.deleteActivitySector(savedactivty.getIdSecteurActivite());


    }
    
}
