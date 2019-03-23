public class Laptop
{

	private String Merk;
	private String Tipe;
	private String Prosesor;
	private String VGA;
	private String Os;
	private int HDD;
	private int RAM;
	private int Size;
	private int Weight;
	private int Harga;


	
	public void setMerk(String Merk){
		this.Merk = Merk;
	}
	public String getMerk(){
		return this.Merk;
	}
	public void setTipe(String Tipe){
		this.Tipe = Tipe;
	}
	public String getTipe(){
		return this.Tipe;
	}
	public void setHarga(int Harga){
		this.Harga = Harga;
	}
	public int getHarga(){
		return this.Harga;
	}
	public void setProsesor(String Prosesor){
		this.Prosesor = Prosesor;
	}
	public String getProsesor(){
		return this.Prosesor;
	}
	public void setVGA(String VGA){
		this.VGA = VGA;
	}
	public String getVGA(){
		return this.VGA;
	}
	public void setHDD(int HDD){
		this.HDD = HDD;
	}
	public int getHDD(){
		return this.HDD;
	}
	public void setRAM(int RAM){
		this.RAM = RAM;
	}
	public int getRAM(){
		return this.RAM;
	}
	public void setSize(int Size){
		this.Size = Size;
	}
	public int getSize(){
		return this.Size;
	}
	public void setWeight(int Weight){
		this.Weight = Weight;
	}
	public int getWeight(){
		return this.Weight;
	}
	public void setOs(String Os){
		this.Os = Os;
	}
	public String getOs(){
		return this.Os;
	}
}