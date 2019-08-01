package mulight.projects.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import mulight.projects.dataobject.Watch;
import mulight.projects.service.WatchService;

@Service
public class WatchServiceImpl implements WatchService {
	private HashMap<String, Object> initWatchList() {
		Watch watch1 = new Watch();
		Watch watch2 = new Watch();
		Watch watch3 = new Watch();
		Watch watch4 = new Watch();
		watch1.setID("001");
		watch1.setName("Rolex");
		watch1.setUnitPrice(100);
		watch1.setDiscountSub(3);
		watch1.setDiscountMain(200);

		watch2.setID("002");
		watch2.setName("Michael Kors");
		watch2.setUnitPrice(80);
		watch2.setDiscountSub(2);
		watch2.setDiscountMain(120);

		watch3.setID("003");
		watch3.setName("Swatch");
		watch3.setUnitPrice(50);
		watch3.setDiscountSub(0);
		watch3.setDiscountMain(0);

		watch4.setID("004");
		watch4.setName("Casio");
		watch4.setUnitPrice(30);
		watch4.setDiscountSub(0);
		watch4.setDiscountMain(0);

		HashMap<String, Object> hm1 = new HashMap<String, Object>();
		hm1.put("001", watch1);
		hm1.put("002", watch2);
		hm1.put("003", watch3);
		hm1.put("004", watch4);
		return hm1;
	}

	public double calculatePrice(List<String> watchlists) {
		HashMap<String, Object> watchhm = initWatchList();
		for (String item : watchlists) {
			System.out.println(((Watch) watchhm.get(item)).getName());
			((Watch) watchhm.get(item)).Incr();
		}
		double totalprice = 0;

		for (Map.Entry<String, Object> entry : watchhm.entrySet()) {
			totalprice = totalprice + ((Watch) entry.getValue()).getSubTotalPrice();
		}
		return totalprice;
	}
}
