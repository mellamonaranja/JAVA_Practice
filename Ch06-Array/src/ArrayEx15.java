import java.util.Arrays;
public class ArrayEx15 {

	public static void main(String[] args) {
		String[] myclass = {
				"������", "����ȣ", "������", "������", "�Ž���",
				"������", "������", "������", "������", "��ȣ��",
				"����", "���α�", "����", "�̼���", "���¿�",
				"�輭ȫ", "������", "������", "�輺��", "�ڹμ�",
				"�̱���"
		};
		
		System.out.println(Arrays.toString(myclass));
		
		Arrays.sort(myclass);
		System.out.println(Arrays.toString(myclass));
	}

}
