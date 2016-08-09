package ru.beeline.bigdata.flowmanager.workflow.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Is used for establishing connection with python sockets
 * Change HOST & PORT if don't want to use default
 *
 * Created by aleksandrlazarenko on 16.07.16.
 * lazarenko.ale@gmail.com
 * Telegram: @alexlazarenko
 */
public class PyConnector {

    private final String HOST = "localhost";
    private final int PORT = 8889;

    private static PyConnector instance;

    private PyConnector() {}

    public static PyConnector getInstance () {
        if (instance == null)
            instance = new PyConnector();
        return instance;
    }

    /**
     * Gets workflow, using socket connection with python module
     * Change HOST & PORT, if you need
     * Obviously, should be similar in python code too.
     *
     * @param phrase - phrase to classify
     * @return classified flow or "Connection error" or "IO error"
     */
    public String getWorkflow(String phrase) throws IOException {

        Socket socket = new Socket(HOST, PORT);
        System.out.println("Connected");

        // Getting streams which we need for establishing connection
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // Sending to server
        out.println(phrase);

        // Receiving output
        String recognisedFlow = in.readLine();
        System.out.println("Recognised flow: " + recognisedFlow);

        // Closing socket
        socket.close();
        System.out.println("Socket closed");

        return recognisedFlow;
    }

}
