package dao;
import java.util.*;
public class Node implements Comparable<Node>,Cloneable{
	private String  nodeId;// The IPAddress of the node
	//The ports of the node,for unnumbered link
	private List<String> ports=new ArrayList<String>();
	//The location of the node on the GUI
	private int x;
	private int y;
	public int compareTo(Node node)
	{
		return (node.GetNodeid() == nodeId ? 0 : 1);
	}
	public Node(Node node)
	{
		System.out.println(node);
		System.out.println(this);
		this.nodeId=node.nodeId;
		this.ports=node.ports;
		this.x=node.x;
		this.y=node.y;
		
	}
	public Node(String nodeId,List<String> port)
	{
		this.nodeId=nodeId;
		for(int i=0;i<port.size();i++)
			ports.add(port.get(i));
			
	}
	public String GetNodeid()
	{
		return nodeId;
	}
	public void AddPort(String port){
		ports.add(port);
	}
	public String GetPort(int i)
	{
		return ports.get(i);
	}
	public int GetX()
	{
		return x;
	}
	public int GetY()
	{
		return y;
	}
	public void  SetY(int y)
	{
		this.y=y;
	}
	public void SetX(int x)
	{
		this.x=x;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nodeId == null) ? 0 : nodeId.hashCode());
		result = prime * result + ((ports == null) ? 0 : ports.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Node other = (Node) obj;
		if (nodeId == null) {
			if (other.nodeId != null)
				return false;
		} else if (!nodeId.equals(other.nodeId))
			return false;
		/*if (ports == null) {
			if (other.ports != null)
				return false;
		} else if (!ports.equals(other.ports))
			return false;*/
		/*if (x != other.x)
			return false;
		if (y != other.y)
			return false;*/
		return true;
	}

	public Node clone() /*throws CloneNotSupportedException */{
		// TODO Auto-generated method stub
		try{
		return (Node)super.clone();
	}catch(Exception e){
		e.getStackTrace();
	}
		return null;
	}

	
}
