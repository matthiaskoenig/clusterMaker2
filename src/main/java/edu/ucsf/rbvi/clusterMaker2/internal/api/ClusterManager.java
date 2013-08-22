package edu.ucsf.rbvi.clusterMaker2.internal.api;

import org.cytoscape.group.CyGroup;
import org.cytoscape.model.CyEdge;
import org.cytoscape.model.CyNetwork;
import org.cytoscape.model.CyNode;
import org.cytoscape.model.CyTableFactory;
import org.cytoscape.model.CyTableManager;

import java.util.Collection;
import java.util.List;

public interface ClusterManager {
	public final static String GROUP_ATTRIBUTE = "__clusterGroups.SUID";
	public final static String MATRIX_ATTRIBUTE = "__distanceMatrix";
	public final static String CLUSTER_NODE_ATTRIBUTE = "__nodeClusters";
	public final static String CLUSTER_ATTR_ATTRIBUTE = "__attrClusters";
	public final static String CLUSTER_EDGE_ATTRIBUTE = "__clusterEdgeWeight";
	public final static String NODE_ORDER_ATTRIBUTE = "__nodeOrder";
	public final static String ARRAY_ORDER_ATTRIBUTE = "__arrayOrder";
	public final static String CLUSTER_TYPE_ATTRIBUTE = "__clusterType";
	public final static String CLUSTER_ATTRIBUTE = "__clusterAttribute";
	public final static String CLUSTER_PARAMS_ATTRIBUTE = "__clusterParams";


	// Returns the list of cluster algorithms
	public Collection<ClusterTaskFactory> getAllAlgorithms();
	public ClusterTaskFactory getAlgorithm(String name);
	public Collection<ClusterViz> getAllVisualizers();
	public ClusterViz getVisualizer(String name);

	// Add a new algorithm.  This is usually done through listening to
	// osgi registration, but could also be done manually
	public void addAlgorithm(ClusterTaskFactory alg);
	public void removeAlgorithm(ClusterTaskFactory alg);
	public void addVisualizer(ClusterViz alg);
	public void removeVisualizer(ClusterViz alg);

	public CyNetwork getNetwork();
	public CyTableFactory getTableFactory();
	public CyTableManager getTableManager();
	public CyGroup createGroup(CyNetwork network, String name, List<CyNode> nodeList, List<CyEdge> edgeList, boolean register);
	public void removeGroup(CyNetwork network, Long suid);
}

