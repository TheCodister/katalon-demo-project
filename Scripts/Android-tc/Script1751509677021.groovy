// Source - https://stackoverflow.com/a
// Posted by World, modified by community. See post 'Timeline' for change history
// Retrieved 2025-11-20, License - CC BY-SA 4.0

import com.jcraft.jsch.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

String user = "john";
String password = "mypassword";
String host = "192.168.100.23";
int port = 22;
String remoteFile = "/home/john/test.txt";

JSch jsch = new JSch();
Session session = jsch.getSession(user, host, port);
session.setPassword(password);
session.setConfig("StrictHostKeyChecking", "no");
System.out.println("Establishing Connection...");
session.connect();
System.out.println("Connection established.");
System.out.println("Crating SFTP Channel.");
ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
sftpChannel.connect();
System.out.println("SFTP Channel created.");

InputStream inputStream = sftpChannel.get(remoteFile);

try (Scanner scanner = new Scanner(new InputStreamReader(inputStream))) {
	while (scanner.hasNextLine()) {
		String line = scanner.nextLine();
		System.out.println(line);
	}
}

catch (JSchException | SftpException e) {
	e.printStackTrace();
}
