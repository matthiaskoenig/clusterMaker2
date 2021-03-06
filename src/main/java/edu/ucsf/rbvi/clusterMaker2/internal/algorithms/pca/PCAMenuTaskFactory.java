/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca;

import edu.ucsf.rbvi.clusterMaker2.internal.algorithms.AbstractClusterTaskFactory;
import edu.ucsf.rbvi.clusterMaker2.internal.api.ClusterTaskFactory;
import edu.ucsf.rbvi.clusterMaker2.internal.api.ClusterViz;
import java.util.Collections;
import java.util.List;
import org.cytoscape.model.CyNetwork;
import org.cytoscape.work.TaskIterator;

/**
 *
 * @author root
 */
public class PCAMenuTaskFactory extends AbstractClusterTaskFactory{
        public PCAMenuTaskFactory(){
        }
    
        public String getShortName() {return "pca";};
	public String getName() {return "--- Principal Component Analysis ---";};

	public ClusterViz getVisualizer() {
		return null;
	}

	public boolean isReady() {
		return false;
	}
        
        @Override
        public boolean isAvailable(CyNetwork network) {
		return false;
	}

	public List<ClusterTaskFactory.ClusterType> getTypeList() { 
		return Collections.singletonList(ClusterTaskFactory.ClusterType.PCA); 
	}

	public TaskIterator createTaskIterator() {
		return null;
	}    
}
