package network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadImage {
	public static void main(String []args) {
		InputStream in = null;
		OutputStream out = null;
		int readByteNo;
		String website = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzA2MjlfMjE1%2FMDAxNjg4MDQ5NDg5OTQw.LxOVHpUCEL6-3vMfLqu4bRxU_6x55RKAe0cKYu8qsG0g.IbxaUItHpJ2EgUU765NCG58zsMFrbyWFb323RkgKsjQg.JPEG.dokyung2727%2Fbsadlg_%25283%2529.jpg&type=sc960_832";
		
		try {
			URL url = new URL (website);
			URLConnection con = url.openConnection();
			in = new BufferedInputStream(con.getInputStream());
			
			out = new BufferedOutputStream(new FileOutputStream("집"));
			
			byte[] data = new byte[2048];
			while((readByteNo = in.read(data)) != -1) {
				out.write(data, 0, readByteNo);
			}
			System.out.println(website + "에서 이미지를 다운로드 완료되었습니다");
		}catch(MalformedURLException e) {
			System.out.println("URL ERROR");
		}catch (IOException i) {
			System.out.println("IO ERROR");
		}finally {
			try {
				if(out!=null)
					out.close();
				if(in!=null)
					in.close();
			}catch(Exception e) {
				System.out.println("Close Error");
			}
		}
	}
}
