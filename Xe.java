abstract class XeMay{
	abstract void brake();

}
class XeMayTheThao extends XeMay{
	@Override
	public void brake() {
		System.out.println("Bóp Thắng!");
	}
}
class XeMayLeoNui extends XeMay{
	@Override
	public void brake() {
		System.out.println("Bóp Thắng!");
	}
}
public class Xe{
   public static void main(String[] args) {
	   
	   XeMayTheThao xmtt=new XeMayTheThao();
       xmtt.brake();
       XeMayLeoNui xmln=new XeMayLeoNui();
       xmln.brake();

    }
}