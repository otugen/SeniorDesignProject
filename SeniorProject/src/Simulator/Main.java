package Simulator;
import Helper.*;
import kPath.Graph;
import kPath.VariableGraph;

import java.io.FileNotFoundException;

public class Main {
    public static void main (String args[]) throws FileNotFoundException {

        Simulator sim = new Simulator(2000000); //milisecond
        TopologyReader tr = new TopologyReader("data/input.txt",sim);
        Graph graph3 = new VariableGraph("data/ginput.txt");
        Graph graph1 = new VariableGraph("data/ginput.txt");

        PrefixReader pr = new PrefixReader("data/prefix_input.txt",sim);
        ServeReader sr = new ServeReader("data/serve_input.txt",sim);
        DemandReader dr = new DemandReader("data/demand_input.txt",sim);

        sim.buildPaths(graph3,3);
        sim.initialization(10000,116185, 17,19);
        sim.runSimulation(graph3, 3);
        sim.printLinkLoads("../vis-data/path3_1.csv");

        sim.resetVariables();

        sim.buildPaths(graph1,1);
        sim.initialization(10000,116185, 17,19);
        sim.runSimulation(graph1, 1);

        sim.printLinkLoads("../vis-data/path1_1.csv");
    }
}
