package dao;


public class Link {
	// Fields
    //The identifier of the link including the routerid the areaid and the linkstateid
	private String name;
	private TedentryId id;
	private Long UnreservedBandwidth;
	private Integer Cost;
	private Integer Cost2;
	private boolean active=true;
	//the reference of the local node and remote node
	private Node LocalNode;
	private Node RemoteNode;
	private Integer flag=0;

	// Constructors

	/** default constructor */
	public void UseIt(){
		flag++;
	}
	public void ClearFlag(){
		flag=0;
	}
	public Boolean CommonLink(){
		if(flag==2)
			return true;
		else 
			return false;
	}
	public Link(TedentryId id,long UnreservedBandwidth,int Cost) {
		this.id=id;
		this.UnreservedBandwidth=UnreservedBandwidth;
		this.Cost=Cost;
		this.Cost2=Cost;
	}
	public Link(TedentryId id,long UnreservedBandwidth,int Cost, Node LocalNode, Node RemoteNode) {
		this.id=id;
		this.UnreservedBandwidth=UnreservedBandwidth;
		this.Cost=Cost;
		this.Cost2=Cost;
		this.LocalNode=LocalNode;
		this.RemoteNode= RemoteNode;
	}
	// Property accessors

	public TedentryId getId() {
		return this.id;
	}

	public void setId(TedentryId id) {
		this.id = id;
	}


	public Long getUnreservedBandwidth() {
		return this.UnreservedBandwidth;
	}

	public void setTeUnreservedBandwidth(Long teUnreservedBandwidth) {
		this.UnreservedBandwidth = teUnreservedBandwidth;
	}

	public Integer getCost() {
		return this.Cost;
	}

	public void setCost(Integer teCost) {
		this.Cost = teCost;
	}
	public void setLocalNode(Node localNode)
	{
		if(localNode.GetNodeid().equals(id.getTeRouterId()))
		{
			this.LocalNode=localNode;
		}
		else
			System.out.println("wrong localNode");
	}
	public void setRemoteNode(Node remoteNode)
	{
		if(remoteNode.GetNodeid().equals(id.getTeLinkIdAddr()))
		{
			this.RemoteNode=remoteNode;
		}
		else 
			System.out.println("wrong remoteNode");
			
	}
	public Node getLocalNode()
	{
		return this.LocalNode;
	}
	public Node getRemoteNode()
	{
		return this.RemoteNode;
	}
// it may not work correctly
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cost == null) ? 0 : Cost.hashCode());
		result = prime * result
				+ ((id.getTeLinkIdAddr() == null) ? 0 : id.getTeLinkIdAddr().hashCode());
		result = prime * result + ((id.getTeLocalId() == null) ? 0 : id.getTeLocalId().hashCode());
		result = prime * result
				+ ((LocalNode == null) ? 0 : LocalNode.hashCode());
		result = prime * result
				+ ((id.getTeRemoteId() == null) ? 0 : id.getTeRemoteId().hashCode());
		result = prime * result
				+ ((RemoteNode == null) ? 0 : RemoteNode.hashCode());
		result = prime
				* result
				+ ((UnreservedBandwidth == null) ? 0 : UnreservedBandwidth
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Link other = (Link) obj;
		if (Cost == null) {
			if (other.Cost != null)
				return false;
		} else if (!Cost.equals(other.Cost))
			return false;
		if (id.getTeLinkIdAddr() == null) {
			if (other.id.getTeLinkIdAddr() != null)
				return false;
		} else if (!id.getTeLinkIdAddr().equals(other.id.getTeLinkIdAddr()))
			return false;
		if (id.getTeLocalId()== null) {
			if (other.id.getTeLocalId() != null)
				return false;
		} else if (!id.getTeLocalId().equals(other.id.getTeLocalId()))
			return false;
		if (LocalNode == null) {
			if (other.LocalNode != null)
				return false;
		} else if (!LocalNode.equals(other.LocalNode))
			return false;
		if (id.getTeRemoteId() == null) {
			if (other.id.getTeRemoteId() != null)
				return false;
		} else if (!id.getTeRemoteId().equals(other.id.getTeRemoteId()))
			return false;
		if (RemoteNode == null) {
			if (other.RemoteNode != null)
				return false;
		} else if (!RemoteNode.equals(other.RemoteNode))
			return false;
		if (UnreservedBandwidth == null) {
			if (other.UnreservedBandwidth != null)
				return false;
		} else if (!UnreservedBandwidth.equals(other.UnreservedBandwidth))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Integer getCost2() {
		return Cost2;
	}
	public void setCost2(Integer cost2) {
		Cost2 = cost2;
	}
	
	public String toString() {
		return "";
		// TODO Auto-generated method stub
	//	return IPAddress.Long2ip(id.getTeRouterId())+IPAddress.Long2ip(LinkIdAddr);
	}
}