package com.biggiser.beans;

/**
 * @author Jiale Wang, Yao Yao
 * HPSCIL & LIESMARS
 */
public class BaseScore {
	public double wealthyScore;
	public double safelyScore;
	public double livelyScore;
	public double beautifulScore;
	public double boringScore;
	public double depressionScore;
	public String fileName;
	
	public BaseScore() {
		super();
		this.wealthyScore = -1;
		this.safelyScore = -1;
		this.livelyScore = -1;
		this.beautifulScore = -1;
		this.boringScore = -1;
		this.depressionScore = -1;
		this.fileName = "";
	}

	public BaseScore(String filename) {
		super();
		this.wealthyScore = -1;
		this.safelyScore = -1;
		this.livelyScore = -1;
		this.beautifulScore = -1;
		this.boringScore = -1;
		this.depressionScore = -1;
		this.fileName = filename;
	}
	
	public BaseScore(double wealthyScore, double safelyScore, double livelyScore, double beautifulScore,
			double boringScore, double depressionScore, String fileName) {
		super();
		this.wealthyScore = wealthyScore;
		this.safelyScore = safelyScore;
		this.livelyScore = livelyScore;
		this.beautifulScore = beautifulScore;
		this.boringScore = boringScore;
		this.depressionScore = depressionScore;
		this.fileName = fileName;
	}

	public double getScore(String str){
		if(str.equals("wealthy")){
			return wealthyScore;
		}else if(str.equals("safely")){
			return safelyScore;
		}else if(str.equals("lively")){
			return livelyScore;
		}else if(str.equals("beautiful")){
			return beautifulScore;
		}else if(str.equals("boring")){
			return boringScore;
		}else{
			return depressionScore;
		}
	}
	
	public double getWealthyScore() {
		return wealthyScore;
	}

	public void setWealthyScore(double wealthyScore) {
		this.wealthyScore = wealthyScore;
	}

	public double getSafelyScore() {
		return safelyScore;
	}

	public void setSafelyScore(double safelyScore) {
		this.safelyScore = safelyScore;
	}

	public double getLivelyScore() {
		return livelyScore;
	}

	public void setLivelyScore(double livelyScore) {
		this.livelyScore = livelyScore;
	}

	public double getBeautifulScore() {
		return beautifulScore;
	}

	public void setBeautifulScore(double beautifulScore) {
		this.beautifulScore = beautifulScore;
	}

	public double getBoringScore() {
		return boringScore;
	}

	public void setBoringScore(double boringScore) {
		this.boringScore = boringScore;
	}

	public double getDepressionScore() {
		return depressionScore;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setDepressionScore(float depressionScore) {
		this.depressionScore = depressionScore;
	}

	@Override
	public String toString() {
		return String.format(
				"BaseScore [wealthyScore=%s, safelyScore=%s, livelyScore=%s, beautifulScore=%s, boringScore=%s, depressionScore=%s]",
				wealthyScore, safelyScore, livelyScore, beautifulScore, boringScore, depressionScore);
	}
	
}
