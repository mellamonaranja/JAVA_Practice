
public class OperatorEx16 {
	
	public static void main(String[] args) {
		
		
		byte a = 12;
		
		System.out.println("a: " + a);
		
//		128 64 32 16 8 4 2 1
//		0    0  0  0 1 0 0 0
//		12와 같거나, 가까운 작은 수
//		12-8=4
//		0    0  0  0 1 1 0 0 ∴4-4=0 		
//		10진수-->2진수로
//		오른쪽으로 2번 밀어내면
//		0    0  0  0 0 0 1 1  ∴ 2+1=3
//		0    0  1  1 0 0 0 0  ∴ 32+16=48 

		System.out.println("a: " + a);
		
		byte c = (byte)(a >> 2);
		System.out.println("a >> 2:" + c);
		
		byte d = (byte)(a << 2);
		System.out.println("a << 2:" + d);
		
		byte e = (byte)(a >>> 2);
		System.out.println("a >>> 2:" + e);
		
		
	}

}
