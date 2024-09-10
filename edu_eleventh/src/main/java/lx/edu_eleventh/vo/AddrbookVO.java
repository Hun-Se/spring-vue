package lx.edu_eleventh.vo;

public class AddrbookVO {
	public String abName;
	public String abEmail;
	public String abTel;
	public String abBirth;
	public String abComdept;
	public String abMemo;
	public int abId;

	
	public String getAbName() {
		return abName;
	}
	public void setAbName(String abName) {
		this.abName = abName;
	}
	public String getAbEmail() {
		return abEmail;
	}
	public void setAbEmail(String abEemail) {
		this.abEmail = abEemail;
	}
	public String getAbTel() {
		return abTel;
	}
	public void setAbTel(String abTel) {
		this.abTel = abTel;
	}
	public String getAbBirth() {
		return abBirth;
	}
	public void setAbBirth(String abBirth) {
		this.abBirth = abBirth;
	}
	public String getAbComdept() {
		return abComdept;
	}
	public void setAbComdept(String abComdept) {
		this.abComdept = abComdept;
	}
	public String getAbMemo() {
		return abMemo;
	}
	public void setAbMemo(String abMemo) {
		this.abMemo = abMemo;
	}
	public int getAbId() {
		return abId;
	}
	public void setAbId(int abId) {
		this.abId = abId;
	}
	
	@Override
	public String toString() {
		return "AddrbookVO [abName=" + abName + ", abEemail=" + abEmail + ", abTel=" + abTel + ", abBirth=" + abBirth
				+ ", abComdept=" + abComdept + ", abMemo=" + abMemo + ", abId=" + abId + "]";
	}
}
