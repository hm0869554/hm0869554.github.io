
public class worldpopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p0;
		double p1;
		double p2;
		double p3;
		double p4;
		double p5;
		double Bth;
		double Dth;
		double Imn;
		p0 = 312032486;
		Bth = 31536000/7.0;
		Dth = 31536000/13.0;
		Imn = 31536000/45.0;
		
		System.out.println("original population: " + p0);
		p1 = (p0 + Bth - Dth + Imn);
		System.out.println("Population after 1 year: " + p1);
		p2 = (p1 + Bth - Dth + Imn);
		System.out.println("Population after 2 year: " + p2);
		p3 = (p2 + Bth - Dth + Imn);
		System.out.println("Population after 3 year: " + p3);
		p4 = (p3 + Bth - Dth + Imn);
		System.out.println("Population after 4 year: " + p4);
		p5 = (p4 + Bth - Dth + Imn);
		System.out.println("Population after 5 year: " + p5);
	}

}
