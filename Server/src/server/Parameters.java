/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Alexis
 */
public class Parameters {
    private ServerSocket Port_Number;
    private Socket Socket_Server;
    private BufferedReader in; 
    private PrintWriter out; 
        
    /**
     * @param P_Port_Number
     * @throws IOException 
     */
    public Parameters(int P_Port_Number) throws IOException{
        Port_Number = new ServerSocket(P_Port_Number);
        System.out.println("Server is listening on port " + Port_Number.getLocalPort());
        Socket_Server = Port_Number.accept();
        System.out.println("Someone is connecting");
    }
    
    /**
     * 
     * @param P_Message
     * @throws IOException 
     */
    public void Write_Message(String P_Message) throws IOException{
        out = new PrintWriter(Socket_Server.getOutputStream());
        out.println(P_Message);
        out.flush();
    }
    
    /**
     * @param P_ServerSocket
     * @param P_Socket
     * @throws IOException 
     */
    public void Close_Socket(ServerSocket P_ServerSocket, Socket P_Socket) throws IOException{
        P_ServerSocket.close();
        P_Socket.close();
    }

    /**
     * @return the Port_Number
     */
    public ServerSocket getPort_Number() {
        return Port_Number;
    }

    /**
     * @param Port_Number the Port_Number to set
     */
    public void setPort_Number(ServerSocket Port_Number) {
        this.Port_Number = Port_Number;
    }

    /**
     * @return the Socket_Server
     */
    public Socket getSocket_Server() {
        return Socket_Server;
    }

    /**
     * @param Socket_Server the Socket_Server to set
     */
    public void setSocket_Server(Socket Socket_Server) {
        this.Socket_Server = Socket_Server;
    }

    /**
     * @return the in
     */
    public BufferedReader getIn() {
        return in;
    }

    /**
     * @param in the in to set
     */
    public void setIn(BufferedReader in) {
        this.in = in;
    }

    /**
     * @return the out
     */
    public PrintWriter getOut() {
        return out;
    }

    /**
     * @param out the out to set
     */
    public void setOut(PrintWriter out) {
        this.out = out;
    }
    
}
