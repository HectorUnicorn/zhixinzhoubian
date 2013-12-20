package rp2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class Global {
	public static HashMap<String,List<String>> TagArray= new HashMap<String,List<String>>();
	
	static {
		//List<String> childTagList = new ArrayList<String>();
		String foodTagsStr = "��ʳ,�в�,����,�տ�,����,���,С��,���";
		TagArray.put("��ʳ",Arrays.asList(foodTagsStr.split(",")));
		String hotelTagsStr = "�Ƶ�,�õ�,�ù�,����,�д���";
		TagArray.put("�Ƶ�",Arrays.asList(hotelTagsStr.split(",")));
		String shopTagsStr = "����,�̳�,,�ֶ���,����,�ٻ�,����,����";
		TagArray.put("����",Arrays.asList(shopTagsStr.split(",")));
		String KTVTagsStr = "KTV,Ǯ��,ҹ�ܻ�,������,����";
		TagArray.put("KTV",Arrays.asList(KTVTagsStr.split(",")));
		String houseTagsStr = "��Դ,�ز�";
		TagArray.put("��Դ",Arrays.asList(houseTagsStr.split(",")));
		String petrolTagsStr = "����";
		TagArray.put("����",Arrays.asList(petrolTagsStr.split(",")));
		String movieTagsStr = "��Ӱ,ӰԺ";
		TagArray.put("��Ӱ", Arrays.asList(movieTagsStr.split(",")));
		String secondHandTagsStr = "��Ӱ,ӰԺ";
		TagArray.put("����", Arrays.asList(secondHandTagsStr.split(",")));
		String urgentTagsStr = "����";
		TagArray.put("����", Arrays.asList(urgentTagsStr.split(",")));
		
	}
	/*public Global()
	{
		//初始化tag 字典
		ArrayList<String> tmpItem = new ArrayList<String>();
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try
		{
			String line = "";
			fis = new FileInputStream("D:/工作/其他工作/hackthon/code/trunk/zhoubian_web/mytest/src/main/java/foo/tag.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			while(null != (line = br.readLine()))
			{
				JSONObject tagObj = JSON.parseObject(line);
				String tagName = tagObj.getString("name");
				JSONArray tagArr = tagObj.getJSONArray("taglist");
				ArrayList<String> strList = new ArrayList<String>();
				for(int i=0;i<tagArr.size();i++)
				{
					strList.add(tagArr.getString(i));
				}
				TagArray.put(tagName, strList);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("指定的文件不存在");
		}
		catch(IOException e)
		{
			System.out.println("打开文件失败");
		}
		finally
		{
			try {
				br.close();
				isr.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}*/
}
