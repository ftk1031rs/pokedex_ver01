package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;

public class WhoColumns {

	/** 登録日付 */
	@Column(name="CREATE_DATE")
    private Date createDate;

	/** 登録者 */
	@Column(name="CREATER")
    private String creater;

	/** 登録プログラムID */
	@Column(name="CREATE_PROGRAM")
    private String createProgram;
	
	/** 更新日付 */
	@Column(name="UPDATE_DATE")
    private Date updateDate;

	/** 更新者 */
	@Column(name="UPDATER")
    private String updater;

	/** 更新プログラムID */
	@Column(name="UPDATE_PROGRAM")
    private String updateProgram;

	/** 更新回数 */
	@Column(name="UPDATE_COUNT")
    private int updateCount;
	
	/** 削除フラグ */
	@Column(name="DELETE_FLAG")
    private int deleteFlag;

    /** Getter Setter */
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getCreateProgram() {
		return createProgram;
	}

	public void setCreateProgram(String createProgram) {
		this.createProgram = createProgram;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public String getUpdateProgram() {
		return updateProgram;
	}

	public void setUpdateProgram(String updateProgram) {
		this.updateProgram = updateProgram;
	}

	public int getUpdateCount() {
		return updateCount;
	}

	public void setUpdateCount(int updateCount) {
		this.updateCount = updateCount;
	}

	public int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}