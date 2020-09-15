package org.asteriskjava.manager.event;

/**
 * Raised when a request violates an ACL check.
 */

public class FailedACLEvent extends ManagerEvent {

	/**
	 * Serializable version identifier.
	 */
	private final static long serialVersionUID = 156546454L;

	private String eventTv;

	private String severity;

	private String service;

	private String eventVersion;

	private String aclName;

	private String privilege;

	private String sessionId;

	private String localAddress;

	private String accountId;

	private String remoteAddress;

	public FailedACLEvent(Object source) {
		super(source);
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getEventTv() {
		return eventTv;
	}

	public void setEventTv(String eventTv) {
		this.eventTv = eventTv;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getEventVersion() {
		return eventVersion;
	}

	public void setEventVersion(String eventVersion) {
		this.eventVersion = eventVersion;
	}

	public String getAclName() {
		return aclName;
	}

	public void setAclName(String aclName) {
		this.aclName = aclName;
	}

	@Override
	public String getPrivilege() {
		return privilege;
	}

	@Override
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getRemoteAddress() {
		return remoteAddress;
	}

	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}
}
