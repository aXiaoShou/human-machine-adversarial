package com.biggiser.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiale Wang, Yao Yao
 * HPSCIL & LIESMARS
 */
public class ImageScore extends BaseScore{
	private List<Double> features;
	
	public ImageScore(String filename) {
		super(filename);
		this.features = new ArrayList<>();
	}

	public void clearFeatures(){
		this.features.clear();
	}
	
	public void addFeature(double f){
		this.features.add(f);
	}

	public List<Double> getFeatures() {
		return features;
	}

	public void setFeatures(List<Double> features) {
		this.features = features;
	}
}
