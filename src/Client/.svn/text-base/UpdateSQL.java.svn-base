package Client; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jexchen.utils.OpenDao;

import dao.Hop;
import dao.HopHome;
import dao.HopId;
import dao.Link;
import dao.Node;
import dao.Tedentry;
import dao.TedentryHome;
import dao.TedentryId;
import dao.Trareq;
import dao.TrareqHome;
import dao.TrareqId;

import emsSession.EmsSession_I;

//向数据库写TED、TE、HOP信息
public class UpdateSQL {
	CORBAClient corbaClient = new CORBAClient();
	EmsSession_I emsSession = corbaClient.initial();
	
	public UpdateSQL() {
		
	}
	
	//向数据库tedentry表写拓扑信息
	public boolean updateTEDENTRY() {
		
		OpenDao open = new OpenDao();  
		String deleteTED = "TRUNCATE TABLE tedentry";
		String deleteTE = "TRUNCATE TABLE trareq";
		String deleteHOP = "TRUNCATE TABLE hop";		
		open.doUpdate(deleteTED); 
		open.doUpdate(deleteTE); 
		open.doUpdate(deleteHOP); 
		
		ArrayList[] tedInfo = corbaClient.getTopologicalLink();
		
		TedentryId tedIdInstance = new TedentryId();
		Tedentry tedInstance = new Tedentry();
		TedentryHome tedHomeInstance = new TedentryHome();
		
		if(tedInfo.length != 0) {
			for(int i = 0;i < tedInfo.length; i++) {
				String teRouterId = (String) tedInfo[i].get(0);
				String teLinkIdAddr = (String) tedInfo[i].get(1);
				String teLocalId = (String) tedInfo[i].get(2);
				String teRemoteId = (String) tedInfo[i].get(3);
				String userName = "admin";
				tedIdInstance.setTeRouterId(teRouterId);
				tedIdInstance.setTeLinkIdAddr(teLinkIdAddr);
				tedIdInstance.setTeLocalId(teLocalId);
				tedIdInstance.setTeRemoteId(teRemoteId);
				tedIdInstance.setUsername(userName);
				
				tedInstance.setId(tedIdInstance);
				tedInstance.setTeLinkStateId(0);
				tedInstance.setTeAreaId(0);
				tedInstance.setTeLinkInformationSource(4);
				tedInstance.setTeLinkInformationData("0.0");
				tedInstance.setTeLinkType(4);
				tedInstance.setTeMetric(5);
				tedInstance.setTeMaxBandwidth((long) 1e10);
				tedInstance.setTeMaxReservableBandwidth((long) 1e10);
				tedInstance.setTeUnreservedBandwidthPri0((long) 1e10);
				tedInstance.setTeUnreservedbandwidthPri1((long) 1e10);
				tedInstance.setTeUnreservedbandwidthPri2((long) 1e10);
				tedInstance.setTeUnreservedbandwidthPri3((long) 1e10);
				tedInstance.setTeUnreservedbandwidthPri4((long) 1e10);
				tedInstance.setTeUnreservedbandwidthPri5((long) 1e10);
				tedInstance.setTeUnreservedbandwidthPri6((long) 1e10);
				tedInstance.setTeUnreservedbandwidthPri7((long) 1e10);
				tedInstance.setTeAdministrativeGroup(0);
				tedInstance.setTeCost(1);
				tedInstance.setTelinkProtectonType(0);
				//admin用户的拓扑
				tedHomeInstance.persist(tedInstance);			
				//user1用户的拓扑
				if(tedIdInstance.getTeRouterId().equals("1(P)") && tedIdInstance.getTeLinkIdAddr().equals("2(P)")
						|| tedIdInstance.getTeRouterId().equals("2(P)") && tedIdInstance.getTeLinkIdAddr().equals("1(P)")
						|| tedIdInstance.getTeRouterId().equals("1(P)") && tedIdInstance.getTeLinkIdAddr().equals("8(P)")
						|| tedIdInstance.getTeRouterId().equals("8(P)") && tedIdInstance.getTeLinkIdAddr().equals("1(P)")
						|| tedIdInstance.getTeRouterId().equals("2(P)") && tedIdInstance.getTeLinkIdAddr().equals("6(P)")
						|| tedIdInstance.getTeRouterId().equals("6(P)") && tedIdInstance.getTeLinkIdAddr().equals("2(P)")
						|| tedIdInstance.getTeRouterId().equals("6(P)") && tedIdInstance.getTeLinkIdAddr().equals("8(P)")
						|| tedIdInstance.getTeRouterId().equals("8(P)") && tedIdInstance.getTeLinkIdAddr().equals("6(P)")) {
					tedIdInstance.setUsername("user1");
					if(tedIdInstance.getTeRouterId().equals("1(P)") && tedIdInstance.getTeLinkIdAddr().equals("2(P)")
							|| tedIdInstance.getTeRouterId().equals("2(P)") && tedIdInstance.getTeLinkIdAddr().equals("1(P)")) {
						tedInstance.setTeMaxBandwidth((long) 5e9);
						tedInstance.setTeMaxReservableBandwidth((long) 5e9);
						tedInstance.setTeUnreservedBandwidthPri0((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri1((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri2((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri3((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri4((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri5((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri6((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri7((long) 5e9);
					}
					tedHomeInstance.persist(tedInstance);
					
				}
				//user2用户的拓扑
				if(tedIdInstance.getTeRouterId().equals("1(P)") && tedIdInstance.getTeLinkIdAddr().equals("2(P)")
						|| tedIdInstance.getTeRouterId().equals("2(P)") && tedIdInstance.getTeLinkIdAddr().equals("1(P)")
						|| tedIdInstance.getTeRouterId().equals("1(P)") && tedIdInstance.getTeLinkIdAddr().equals("7(P)")
						|| tedIdInstance.getTeRouterId().equals("7(P)") && tedIdInstance.getTeLinkIdAddr().equals("1(P)")
						|| tedIdInstance.getTeRouterId().equals("2(P)") && tedIdInstance.getTeLinkIdAddr().equals("7(P)")
						|| tedIdInstance.getTeRouterId().equals("7(P)") && tedIdInstance.getTeLinkIdAddr().equals("2(P)")) {
					tedIdInstance.setUsername("user2");
					if(tedIdInstance.getTeRouterId().equals("1(P)") && tedIdInstance.getTeLinkIdAddr().equals("2(P)")
							|| tedIdInstance.getTeRouterId().equals("2(P)") && tedIdInstance.getTeLinkIdAddr().equals("1(P)")) {
						tedInstance.setTeMaxBandwidth((long) 5e9);
						tedInstance.setTeMaxReservableBandwidth((long) 5e9);
						tedInstance.setTeUnreservedBandwidthPri0((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri1((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri2((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri3((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri4((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri5((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri6((long) 5e9);
						tedInstance.setTeUnreservedbandwidthPri7((long) 5e9);
					}
					tedHomeInstance.persist(tedInstance);
					
				}
			}

			return true;
		}
		else
			return false;
	}
	
	public static int tunnelIndex =1;
	//向数据库trareq表写建路需求信息
	public boolean updateTRAREQ(String src, String des, String bw, String pro) {
		
		TrareqId tedIdInstance = new TrareqId();
		Trareq tedInstance = new Trareq();
		TrareqHome tedHomeInstance = new TrareqHome();
		
		tedIdInstance.setIngressLsrid(src);
		tedIdInstance.setEgressLsrid(des);
		tedIdInstance.setMplsTunnelIndex(tunnelIndex);
		tedIdInstance.setMplsTunnelInstance(1);
		
		tedInstance.setId(tedIdInstance);
		tedInstance.setSetupPrio(0);
		if(bw.equalsIgnoreCase("ODU0")) {
			tedInstance.setBandwidth((long) 1e9);
		}
		else if(bw.equalsIgnoreCase("ODU1")) {
			tedInstance.setBandwidth((long) 25e8);
		}
		else if(bw.equalsIgnoreCase("ODU2")) {
			tedInstance.setBandwidth((long) 1e10);
		}
		else
			System.out.println("Unsupported Rate!\n");
		tedInstance.setIncludeAnyAffinity(null);
		tedInstance.setIncludeAllAffinity(null);
		tedInstance.setExcludeAnyAffinity(null);		
		tedInstance.setMaximumHopmount(null);
		tedInstance.setProtection(null);
		tedInstance.setSwitchingType(null);
		tedInstance.setOperatestate(0);
		tedInstance.setHoptableindex(1);
		tedInstance.setEncodingType(null);
		
		tedHomeInstance.persist(tedInstance);
		
		return true;
	}
	
	public static int mplsTunnelHopListIndex = 1;
	public static int mplsTunnelHopPathOptionIndex = 1;
	public static int mplsTunnelHopIndex = 1;
	
	public boolean updateHop(List<Link> lists) {
		
		HopId hopIdInstance = new HopId();
		Hop hopInstance = new Hop();
		HopHome hopHomeInstance = new HopHome();
		for(int i = 0;i < lists.size();i++) {
			hopIdInstance.setMplsTunnelHopListIndex(mplsTunnelHopListIndex);
			hopIdInstance.setMplsTunnelHopPathOptionIndex(mplsTunnelHopPathOptionIndex);
			hopIdInstance.setMplsTunnelHopIndex(mplsTunnelHopIndex);
			
			hopInstance.setId(hopIdInstance);
			hopInstance.setMplsTunnelHopAddrType(1);
			hopInstance.setMplsTunnelHopIpv4addr(lists.get(i).getId().getTeRouterId());
			hopInstance.setMplsTunnelHopUnnumIfId(lists.get(i).getId().getTeLocalId());
			
			hopHomeInstance.persist(hopInstance);
			
			mplsTunnelHopIndex++;
			
			hopIdInstance.setMplsTunnelHopListIndex(mplsTunnelHopListIndex);
			hopIdInstance.setMplsTunnelHopPathOptionIndex(mplsTunnelHopPathOptionIndex);
			hopIdInstance.setMplsTunnelHopIndex(mplsTunnelHopIndex);
			
			hopInstance.setId(hopIdInstance);
			hopInstance.setMplsTunnelHopAddrType(1);
			hopInstance.setMplsTunnelHopIpv4addr(lists.get(i).getId().getTeLinkIdAddr());
			hopInstance.setMplsTunnelHopUnnumIfId(lists.get(i).getId().getTeRemoteId());
			
			hopHomeInstance.persist(hopInstance);
			
			mplsTunnelHopIndex++;
		}
		return true;
	}
	
	public boolean createPath(String userName, String src, String srcPort, String des, String destPort, String bw, String pro) {
		
		PathComputationElement pce = new PathComputationElement();
		HashMap<Node,List<Link>> maps = pce.GetTopo(userName);
		updateTRAREQ(src, des, bw, pro);
		List<Link> lists = pce.Dijkstra(maps,src,des);
		updateHop(lists);
		corbaClient.createXC4Path(srcPort,destPort,bw,lists);
		tunnelIndex++;
		mplsTunnelHopListIndex++;
		return false;
		
	}
	
	public boolean deletePath(String ingress, String egress, String tunnelIndex, String instance) {
		
		return false;
		
	}
	
	public static void main(String[] args) {
		UpdateSQL test = new UpdateSQL();
		test.updateTEDENTRY();
		String userName = "user1";
		String src = "1(P)";
		String des = "6(P)";
		String bw = "ODU2";
		String pro = "No protection";
//		test.createPath(userName, src, des, bw, pro);
//		TedentryHome th = new TedentryHome();
//		th.findAll();
//		PathComputationElement pce = new PathComputationElement();
//		List<Link> links = pce.GetLinks();
////		for(int i = 0;i < links.size();i++) {
////			System.out.println(links.get(i).getId().getTeRouterId()+"--"+links.get(i).getId().getTeLinkIdAddr());
////		}
//		HashMap<Node,List<Link>> maps = pce.GetTopo();
////		for(int i = 0;i < maps.size();i++) {
////			System.out.println(links.get(i).getId().getTeRouterId()+":");
////			System.out.println(maps.get(links.get(i)).size());
////			for(int j = 0;j<maps.get(links.get(i)).size();j++) {
////				System.out.println(maps.get(links.get(i)).get(j).getId().getTeRouterId()+"--"+maps.get(links.get(i)).get(j).getId().getTeLinkIdAddr());
////			}
//			
////		}
//		List<Link> lists = pce.Dijkstra(maps, "1(P)", "2(P)");
//		for(int i = 0;i <lists.size();i++) {
//			System.out.println(lists.get(i).getId().getTeRouterId()+lists.get(i).getId().getTeLocalId()+"--"+lists.get(i).getId().getTeLinkIdAddr()+lists.get(i).getId().getTeRemoteId());
//		}
	}
}