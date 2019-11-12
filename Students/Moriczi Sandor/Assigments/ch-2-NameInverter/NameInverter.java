
public class NameInverter {
	
	public String nume= new String();
	public NameInverter(String nume)
	{
		this.nume=nume;
	}
	String schimba()
	{
		nume=nume.trim();
		String[] arr=nume.split(" ", -2);
		StringBuilder sb=new StringBuilder();
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[1].contains("Phd."))
			{
				String aux;
				aux=arr[0];
				arr[0]=arr[1];
				arr[1]=aux;
			}
			if(arr[i].contains("Mr"))
				sb.append(arr[i]);
			else
				if(arr[i].contains("Phd"))
					sb.append(arr[i]);
			else
			{
				if(i==0)
					sb.append(arr[i]);
				else
				{
					sb.append(arr[i]);
					sb.append(" , ");
				}
			}
		}
		return sb.toString();
		
	}
	static void afisare(String[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
