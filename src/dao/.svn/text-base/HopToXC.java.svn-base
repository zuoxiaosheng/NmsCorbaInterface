package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//线路侧或客户侧单板端与交叉连接一端的映射
public class HopToXC {
	
	private HashMap<XCHop, XCEnd> hopToXC = new HashMap<XCHop, XCEnd>();
	
	public HopToXC() {
	
		//1(P)网元
		XCHop[] xcHop1 = new XCHop[]{};
		XCEnd[] xcEnd1 = new XCEnd[]{
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1192_1","/odu1=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=4/port=1193_1","/odu1=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=4/port=1192_1","/odu1=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1193_1","/odu1=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=4/port=1192_9","/odu1=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1193_3","/odu1=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1192_3","/odu1=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=4/port=1193_9","/odu1=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=4/port=1192_17","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1193_13","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1192_13","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=4/port=1193_17","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=4/port=1192_49","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1193_17","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1192_17","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=4/port=1193_49","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=4/port=1192_25","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1193_21","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1192_21","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=4/port=1193_25","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=4/port=1192_57","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1193_25","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1192_25","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=4/port=1193_57","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=14/port=1192_1","/odu2=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=6/port=1193_17","/odu2=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=6/port=1192_17","/odu2=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=14/port=1193_1","/odu2=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=14/port=1192_9","/odu2=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=6/port=1193_25","/odu2=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=6/port=1192_25","/odu2=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=14/port=1193_9","/odu2=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1192_15","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1193_15","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1192_19","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1193_19","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1192_23","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1193_23","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1192_27","/odu0=1"),
				new XCEnd("1(P)","/rack=0/shelf=4/slot=50/port=1193_27","/odu0=1")
		};
		
		for(int i = 0;i < xcEnd1.length;i++) {
			this.hopToXC.put(xcHop1[i], xcEnd1[i]);
		}
		
		//2(P)网元
		XCHop[] xcHop2 = new XCHop[]{};
		XCEnd[] xcEnd2 = new XCEnd[]{
				new XCEnd("2(P)","/rack=0/shelf=4/slot=4/port=1192_1","/odu0=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=2/port=1193_15","/odu0=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=2/port=1192_15","/odu0=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=4/port=1193_1","/odu0=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=4/port=1192_17","/odu1=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=2/port=1193_1","/odu1=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=2/port=1192_1","/odu1=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=4/port=1193_17","/odu1=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=4/port=1192_25","/odu0=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=2/port=1193_171","/odu0=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=2/port=1192_17","/odu0=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=4/port=1193_25","/odu0=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=4/port=1192_57","/odu0=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=2/port=1193_19","/odu0=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=2/port=1192_19","/odu0=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=4/port=1193_57","/odu0=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=4/port=1192_33","/odu2=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=15/port=1193_1","/odu2=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=15/port=1192_1","/odu2=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=4/port=1193_33","/odu2=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=4/port=1192_9","/odu2=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=15/port=1193_9","/odu2=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=15/port=1192_9","/odu2=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=4/port=1193_9","/odu2=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=6/port=1192_25","/odu2=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=15/port=1193_17","/odu2=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=15/port=1192_17","/odu2=1"),
				new XCEnd("2(P)","/rack=0/shelf=4/slot=6/port=1193_25","/odu2=1")
		};
		
		for(int i = 0;i < xcEnd2.length;i++) {
			this.hopToXC.put(xcHop2[i], xcEnd2[i]);
		}
		
		//6(P)网元
		XCHop[] xcHop6 = new XCHop[]{};
		XCEnd[] xcEnd6 = new XCEnd[]{
				new XCEnd("6(P)","/rack=0/shelf=4/slot=4/port=1192_1","/odu0=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=2/port=1193_15","/odu0=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=2/port=1192_15","/odu0=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=4/port=1193_1","/odu0=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=4/port=1192_9","/odu0=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=2/port=1193_17","/odu0=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=2/port=1192_17","/odu0=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=4/port=1193_9","/odu0=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=4/port=1192_17","/odu1=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=2/port=1193_1","/odu1=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=2/port=1192_1","/odu1=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=4/port=1193_17","/odu1=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=15/port=1192_1","/odu2=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=4/port=1193_33","/odu2=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=4/port=1193_33","/odu2=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=15/port=1193_1","/odu2=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=15/port=1192_9","/odu2=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=4/port=1193_41","/odu2=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=4/port=1192_41","/odu2=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=15/port=1193_9","/odu2=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=4/port=1192_25","/odu2=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=15/port=1193_17","/odu2=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=15/port=1192_17","/odu2=1"),
				new XCEnd("6(P)","/rack=0/shelf=4/slot=4/port=1193_25","/odu2=1")
		};
		
		for(int i = 0;i < xcEnd6.length;i++) {
			this.hopToXC.put(xcHop6[i], xcEnd6[i]);
		}
		
		//7(P)网元
		XCHop[] xcHop7 = new XCHop[]{};
		XCEnd[] xcEnd7 = new XCEnd[]{
				new XCEnd("7(P)","/rack=0/shelf=4/slot=4/port=1192_1","/odu0=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=2/port=1193_15","/odu0=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=2/port=1192_15","/odu0=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=4/port=1193_1","/odu0=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=4/port=1192_17","/odu1=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=2/port=1193_1","/odu1=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=2/port=1192_1","/odu1=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=4/port=1193_17","/odu1=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=4/port=1192_25","/odu0=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=2/port=1193_17","/odu0=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=2/port=1192_17","/odu0=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=4/port=1193_25","/odu0=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=15/port=1192_1","/odu2=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=4/port=1193_33","/odu2=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=4/port=1192_33","/odu2=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=15/port=1193_1","/odu2=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=4/port=1192_9","/odu2=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=15/port=1193_9","/odu2=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=15/port=1192_9","/odu2=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=4/port=1193_9","/odu2=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=15/port=1192_17","/odu2=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=4/port=1193_57","/odu2=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=4/port=1192_57","/odu2=1"),
				new XCEnd("7(P)","/rack=0/shelf=4/slot=15/port=1193_17","/odu2=1")
		};
		
		for(int i = 0;i < xcEnd7.length;i++) {
			this.hopToXC.put(xcHop7[i], xcEnd7[i]);
		}
		
		//8(P)网元
		XCHop[] xcHop8 = new XCHop[]{};
		XCEnd[] xcEnd8 = new XCEnd[]{
				new XCEnd("8(P)","/rack=0/shelf=4/slot=4/port=1192_25","/odu1=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1193_1","/odu1=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1192_1","/odu1=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=4/port=1193_25","/odu1=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=4/port=1192_9","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1193_13","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1192_13","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=4/port=1193_9","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=4/port=1192_17","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1193_17","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1192_17","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=4/port=1193_17","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=4/port=1192_49","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1193_21","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1192_21","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=4/port=1193_49","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=4/port=1192_1","/odu2=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=15/port=1193_1","/odu2=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=15/port=1192_1","/odu2=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=4/port=1193_1","/odu2=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=4/port=1192_41","/odu2=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=15/port=1193_9","/odu2=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=15/port=1192_9","/odu2=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=4/port=1193_41","/odu2=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=6/port=1192_17","/odu2=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=15/port=1193_17","/odu2=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=15/port=1192_17","/odu2=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=6/port=1193_17","/odu2=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1192_15","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1193_15","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1192_19","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1193_19","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1192_23","/odu0=1"),
				new XCEnd("8(P)","/rack=0/shelf=4/slot=50/port=1193_23","/odu0=1")
		};
		
		for(int i = 0;i < xcEnd8.length;i++) {
			this.hopToXC.put(xcHop8[i], xcEnd8[i]);
		}
	}
	
	public XCEnd getXCEndByXCHop(XCHop xcHop) {
		return this.hopToXC.get(xcHop);
	}
}