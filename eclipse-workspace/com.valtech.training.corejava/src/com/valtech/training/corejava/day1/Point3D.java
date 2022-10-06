package com.valtech.training.corejava.day1;


public class Point3D extends Point implements Comparable<Point>
{
	//public static final Point3D ORIGIN = new Point3D();
	private int z;
	
 
	public Point3D(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
	}
	@Override
	public int hashCode()
	{

	return toString().hashCode();
	}



	@Override
    public boolean equals(Object obj) {
    if (obj instanceof Point3D) {
    Point3D p = (Point3D) obj;
    return p.x == x && p.y == y && p.z==z;
    }

    return false;
    }
	@Override
	public String toString() {
		return new StringBuffer("X= ").append(x).append("Y= ").append(y).append("Z= ").append(z).toString();
	}

	
	

	public Point3D(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor 
	}



	public double distance()
	{
		return Math.sqrt(x*x+y*y+z*z);
	}
	public double distance(int x,int y,int z)
	{
		int dx=this.x-x;
		int dy=this.y-y;
		int dz=this.z-z;
		return Math.sqrt(x*x+y*y+z*z);

	}
	public double distance(Point3D px)
	{
		return distance(px.x,px.y,px.z);
	}
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public int compareTo(Point o) {
	if (distance()<o.distance())
	{
	return -1;
	}
	if (distance() == o.distance())
	{
	if(x<o.x) {
	return -1;
	}
	if(x>o.x){
	return +1;

	}

	return 0;
	}

	return +1;
	}

	

	public static void main(String[] args) {
		//System.out.println(new ());
		Point p=new Point3D(10,20,30);
		System.out.println(p.distance1());
		Point3D p1=(Point3D) p;
		System.out.println(p1.getZ());
	}

}
