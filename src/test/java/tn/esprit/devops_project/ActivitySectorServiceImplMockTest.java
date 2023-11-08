package tn.esprit.devops_project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.devops_project.entities.ActivitySector;
import tn.esprit.devops_project.repositories.ActivitySectorRepository;
import tn.esprit.devops_project.services.ActivitySectorImpl;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
    void testRetreiveAllActivity(){
        ActivitySector a1=new ActivitySector();
        a1.setIdSecteurActivite(1L);
        a1.setCodeSecteurActivite("11111");
        a1.setLibelleSecteurActivite("IT service");
        ActivitySector a2=new ActivitySector();
        a2.setIdSecteurActivite(2L);
        a2.setCodeSecteurActivite("11111");
        a2.setLibelleSecteurActivite("IT service");
        List<ActivitySector> list=new ArrayList<ActivitySector>(){
            {
                add(a1);
                add(a2);
            }
        };
        when(activitySectorRepository.findAll()).thenReturn(list);
        assertNotEquals(list.size(),0);
    }
}
