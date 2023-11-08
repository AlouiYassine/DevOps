package tn.esprit.devops_project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.devops_project.entities.ActivitySector;
import tn.esprit.devops_project.repositories.ActivitySectorRepository;
import tn.esprit.devops_project.services.ActivitySectorImpl;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class ActivitySectorServiceImplMockTest {
    @Mock
    private ActivitySectorRepository activitySectorRepository;
    @InjectMocks
    private ActivitySectorImpl activitySector;
    @Test
    void testAddActivitySector(){
        ActivitySector a=new ActivitySector();
        a.setIdSecteurActivite(1L);
        a.setCodeSecteurActivite("11111");
        a.setLibelleSecteurActivite("IT service");
        when(activitySectorRepository.save(any(ActivitySector.class))).thenReturn(a);
        ActivitySector savedActivity=activitySector.addActivitySector(a);
        assertNotNull(savedActivity.getIdSecteurActivite());
        verify(activitySectorRepository).save(any(ActivitySector.class));
    }
}
