/* https://github.com/orange1438 */
package com.example.dianping_learn_1.model;

import java.util.Date;

public class UserModel {
    /** 
     */ 
    private Integer id;

    /** 
     */ 
    private Date createdAt;

    /** 
     */ 
    private Date updatedAt;

    /** 
     */ 
    private String telphone;

    /** 
     */ 
    private String password;

    /** 
     */ 
    private String nickName;

    /** 
     */ 
    private Integer gender;

    /** 
     * 获取 user.id
     * @return user.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 user.id
     * @param id user.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 user.created_at
     * @return user.created_at
     */
    public final Date getCreatedAt() {
        return createdAt;
    }

    /** 
     * 设置 user.created_at
     * @param createdAt user.created_at
     */
    public final void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /** 
     * 获取 user.updated_at
     * @return user.updated_at
     */
    public final Date getUpdatedAt() {
        return updatedAt;
    }

    /** 
     * 设置 user.updated_at
     * @param updatedAt user.updated_at
     */
    public final void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /** 
     * 获取 user.telphone
     * @return user.telphone
     */
    public final String getTelphone() {
        return telphone;
    }

    /** 
     * 设置 user.telphone
     * @param telphone user.telphone
     */
    public final void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /** 
     * 获取 user.password
     * @return user.password
     */
    public final String getPassword() {
        return password;
    }

    /** 
     * 设置 user.password
     * @param password user.password
     */
    public final void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /** 
     * 获取 user.nick_name
     * @return user.nick_name
     */
    public final String getNickName() {
        return nickName;
    }

    /** 
     * 设置 user.nick_name
     * @param nickName user.nick_name
     */
    public final void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /** 
     * 获取 user.gender
     * @return user.gender
     */
    public final Integer getGender() {
        return gender;
    }

    /** 
     * 设置 user.gender
     * @param gender user.gender
     */
    public final void setGender(Integer gender) {
        this.gender = gender;
    }
}