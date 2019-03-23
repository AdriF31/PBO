public class spek
{
	public static void main(String []args)
	{
		Laptop Spek = new Laptop();
		
		Spek.setMerk("Acer");
		Spek.setTipe("E5-475G-391G");
		Spek.setProsesor("intel core i3-6006U");
		Spek.setVGA("NVIDIA GeForce 940MX");
		Spek.setOs("Windows 10");
		Spek.setRAM(4);
		Spek.setHDD(1000);
		Spek.setHarga(7000000);
		Spek.setSize(14);
		Spek.setWeight(2);
		
		System.out.println("Merk\t\t: "+Spek.getMerk());
		System.out.println("Tipe\t\t: "+Spek.getTipe());
		System.out.println("Prosesor\t: "+Spek.getProsesor());
		System.out.println("VGA\t\t: "+Spek.getVGA());
		System.out.println("RAM\t\t: "+Spek.getRAM()+" GB");
		System.out.println("HDD\t\t: "+Spek.getHDD()+" GB");
		System.out.println("OS\t\t: "+Spek.getOs());
		System.out.println("Ukuran\t\t: "+Spek.getSize()+" inches");
		System.out.println("Berat\t\t: "+Spek.getWeight()+" kg");
		System.out.println("Harga\t\t: Rp "+Spek.getHarga());
	}
}