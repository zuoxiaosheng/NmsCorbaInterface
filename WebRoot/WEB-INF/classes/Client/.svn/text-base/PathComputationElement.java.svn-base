package Client; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import dao.Link;
import dao.Node;
import dao.Tedentry;
import dao.TedentryHome;
import dao.TedentryId;

public class PathComputationElement {
	
	public static List<Link> GetLinks(String userName) {
		List<Link> tempLinks = new ArrayList<Link>();
		TedentryHome th = new TedentryHome();
		List<Tedentry> teds = th.findByUserName(userName);
		
		for(int i = 0;i < teds.size();i++) {
//			System.out.println(teds.get(i).getId().getTeRouterId()+"--"+teds.get(i).getId().getTeLinkIdAddr()+"+");
			TedentryId id = new TedentryId();
			id.setTeRouterId(teds.get(i).getId().getTeRouterId());
			id.setTeLinkIdAddr(teds.get(i).getId().getTeLinkIdAddr());
			id.setTeLocalId(teds.get(i).getId().getTeLocalId());
			id.setTeRemoteId(teds.get(i).getId().getTeRemoteId());
			long UnreservedBandwidth = teds.get(i).getTeUnreservedBandwidthPri0();
			int Cost = teds.get(i).getTeCost();
			Link tempLink = new Link(id,UnreservedBandwidth,Cost);
			tempLinks.add(tempLink);
		}
		
		return tempLinks;
	}
	
	public static HashMap<Node,List<Link>> GetTopo(String userName) {
		
//		HashMap<Node,List<Link>> topo = new HashMap<Node,List<Link>>();
//		List<Node> nodes=new ArrayList<Node>();
//		TedentryHome th = new TedentryHome();
//		List<Tedentry> teds = th.findAll();
//		Set<String> nd = new TreeSet<String>();
//		for(int i = 0;i < teds.size();i++) {
//			Node node = new Node(teds.get(i).getId().getTeRouterId(),null);
//			node.AddPort(teds.get(i).getId().getTeLocalId());
//			nd.add(teds.get(i).getId().getTeRouterId());
//		}
//		Iterator<String> it=nd.iterator();
//		for(int i = 0;i < nd.size();i++) {
//			String tempRid = "";
//			if(it.hasNext())
//				tempRid=it.next();
//			for(int j = 0;j < teds.size();j++) {
//				
//			}
//		}
		
		int [] x={110,200,110,20,20};
		int [] y={100,210,210,100,200};
		HashMap<Node,List<Link>> topo;
		topo=new HashMap<Node,List<Link>>();
		
		List<Link> results=GetLinks(userName);
		Set<String> Rids=new TreeSet<String>();
		
		List<Node> nodes=new ArrayList<Node>();
		for(int i=0;i<results.size();i++) {
			Rids.add(results.get(i).getId().getTeRouterId());			
		}
//		System.out.println(Rids);
		String tempRid="";
		Node tempNode;
		Iterator<String> it=Rids.iterator();
		List<Link> links=new ArrayList<Link>();
		//ports are null.
		for(int i=0;i<Rids.size();i++)
		{
			if(it.hasNext())
				tempRid=it.next();
//			System.out.println(tempRid);
			List<String> ports=new ArrayList<String>();
			tempNode=new Node(tempRid,ports);
			nodes.add(tempNode);
		}
		
		//Every node contains the port numbers belonged to it ,and the corresponding links  contains the local node and remote node
		//information.
		for(int i=0;i<Rids.size();i++)
		{
			nodes.get(i).SetX(x[i]);
			nodes.get(i).SetY(y[i]);
			links=new ArrayList<Link>();
			//The monica link in list<Link> has the same teRouterId ipAddr with node ipAddr.
			for(int j=0;j<results.size();j++){
				if(results.get(j).getId().getTeRouterId().equals(nodes.get(i).GetNodeid()))
				{
					links.add(results.get(j));
//					System.out.println(results.get(j).getId().getTeRouterId()+"="+(nodes.get(i).GetNodeid()));
				}
			}
			
			 for(int j=0;j<links.size();j++)
			 {
				 //add ports  in list<node> for every node.
				 nodes.get(i).AddPort(links.get(j).getId().getTeLocalId());
//				 System.out.println(links.get(j).getId().getTeLocalId());
				 //set the corresponding local node to selected link
				 links.get(j).setLocalNode(nodes.get(i));
				 //set the corresponding remote node to selected link
				 for(int m=0;m<nodes.size();m++)
				 {
					 if(nodes.get(m).GetNodeid().equals(links.get(j).getId().getTeLinkIdAddr())) {
//						 System.out.println(nodes.get(m).GetNodeid()+"="+(links.get(j).getId().getTeLinkIdAddr()));
						 links.get(j).setRemoteNode(nodes.get(m));
					 }
						 
				 }
			 }
			 topo.put(nodes.get(i), links);	
		}
		System.out.println("Get topo succeed.");
		for(int i = 0;i < topo.size();i++) {
//			System.out.println(nodes.get(i).GetNodeid()+":");
			for(int j = 0;j < topo.get(nodes.get(i)).size();j++) {
//				System.out.println(topo.get(nodes.get(i)).get(j).getId().getTeLinkIdAddr());
			}
		}
		
		return topo;
		
	}
	
	// algorithm dijkatra
	public List<Link> Dijkstra (HashMap<Node, List<Link>> monTopo, String source, String destination) {
		//moTopo代表拓扑，用每个节点及每个节点所连接的链路表示
		//最短路径的链路集合
		List<Link> monTmpPath = new ArrayList<Link>();
		//<节点ID,节点>
		HashMap<String, Node> index = new HashMap<String, Node>();
		//<节点,节点到源节点的最短距离>
		HashMap<Node, Integer> SP = new HashMap<Node, Integer>();
		//<节点,节点是否为永久节点>
		HashMap<Node, Boolean> mark = new HashMap<Node, Boolean>();
		//<节点，节点到源节点最短路径上的下一跳（永久节点）>
		HashMap<Node, Node> pred = new HashMap<Node, Node>();
		
		for (Node vertice : monTopo.keySet()) {
			//将拓扑中每个节点用ID索引
			index.put(vertice.GetNodeid(), vertice);
			//将拓扑中每个节点到源节点的最短路径初始为无穷大
			SP.put(vertice, Integer.MAX_VALUE);
			//将拓扑中每个节点标记为非永久节点
			mark.put(vertice, false);
		}
		//将源节点到源节点的最短距离改为0
		SP.remove(index.get(source));		
		SP.put(index.get(source), 0);
		System.out.println("source:" + source);
		System.out.println("destination:" + destination);
		int n = 1;
		//如果节点中还有非永久节点且目标节点也为非永久节点，则执行
		while (mark.containsValue(false) && mark.get(index.get(destination)) == false) {			
			int mincost = Integer.MAX_VALUE;
			Node minnode=null;
			
			for (Node vertice : monTopo.keySet()) {//find the minnode from the sp
				if (mark.get(vertice).equals(false) && SP.get(vertice) <= mincost) { 
					mincost = SP.get(vertice); 
					minnode = vertice;
				}
			}//find the minnode and  remove it 
//			System.out.println("("+minnode.GetNodeid()+")");
			mark.remove(minnode);
			mark.put(minnode, true);//the SPF of this minnode is found
			
			for (int i=0; i<monTopo.get(minnode).size(); i++) {
				//对于mininode所连接的每条Link
				Link edge=monTopo.get(minnode).get(i);
//				System.out.println(edge.getId().getTeLinkIdAddr());
				//如果该Link所连接的目标端节点为非永久节点，则执行
				if (mark.get(index.get((edge.getId().getTeLinkIdAddr()))).equals(false)) {
					//如果找到一条路比源节点到该Link所连接的目标节点路径要短，则用新路径代替旧路径
					if (SP.get(minnode)+edge.getCost() < SP.get(index.get(edge.getId().getTeLinkIdAddr()))) {
						SP.remove(index.get(edge.getId().getTeLinkIdAddr()));
						SP.put(index.get(edge.getId().getTeLinkIdAddr()), SP.get(minnode).intValue()+edge.getCost());
						
						pred.remove(index.get(edge.getId().getTeLinkIdAddr()));
						pred.put(index.get(edge.getId().getTeLinkIdAddr()), minnode);
					}
				}
			}			
//			System.out.println(minnode.GetNodeid()+":("+SP.get(minnode));
//			if(n!=1)
//			System.out.println(minnode.GetNodeid()+"next hop:"+pred.get(minnode).GetNodeid());
//			n++;
		}
		List<Link> monTmpPath_r = new ArrayList<Link>();
		for (Node vertice = index.get(destination); !vertice.GetNodeid().equals(source); vertice = pred.get(vertice))
		{
//			System.out.println(source);
//			System.out.println("current node:"+vertice.GetNodeid());
//			System.out.println("Computing:"+pred.get(vertice).GetNodeid());
//			System.out.println(monTopo.get(pred.get(vertice)).get(0).getId().getTeLinkIdAddr());
			for (Link edge : monTopo.get(pred.get(vertice))) {
				if (edge.getId().getTeLinkIdAddr().equals(vertice.GetNodeid())) {
					monTmpPath_r.add(edge); 					
					}
			}
//			break;
		}
		Set<Node> set=pred.keySet();
		System.out.println("hop:");
		for (int i=monTmpPath_r.size()-1; i>=0; i--) 
		{
			monTmpPath.add(monTmpPath_r.get(i));
			System.out.println(monTmpPath_r.get(i).getId().getTeRouterId() + ":" + monTmpPath_r.get(i).getId().getTeLocalId());
			System.out.println(monTmpPath_r.get(i).getId().getTeLinkIdAddr() + ":" + monTmpPath_r.get(i).getId().getTeRemoteId());
			
			
		}
		return monTmpPath;
	}
}