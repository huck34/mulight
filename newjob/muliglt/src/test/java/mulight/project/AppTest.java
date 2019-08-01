package mulight.project;



import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mulight.projects.service.WatchService;
import mulight.projects.service.impl.WatchServiceImpl;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AppTest.class)
public class AppTest 
{
    @Test
    public void testApp()
    {
    	WatchService watchService=new WatchServiceImpl();
    	System.out.println(watchService);
    	List<String> watchlists= new ArrayList<String>();
    	watchlists.add("003");
    	watchlists.add("001");
    	watchlists.add("001");
    	watchlists.add("002");
    	watchlists.add("004");
    	watchlists.add("002");
    	watchlists.add("002");
    	double totalPrcie=watchService.calculatePrice(watchlists);
        assertTrue( totalPrcie==513 );
    }
}
