/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

/**
 * 
 */
package org.mobicents.protocols.ss7.tcap.asn.comp;

import org.mobicents.protocols.asn.Tag;
import org.mobicents.protocols.ss7.tcap.asn.Encodable;

/**
 * @author baranowb
 *
 */
public interface OperationCode extends Encodable{

	public static final int _TAG_LOCAL = Tag.INTEGER;
	public static final int _TAG_GLOBAL = Tag.OBJECT_IDENTIFIER;
	public static final int _TAG_CLASS = Tag.CLASS_UNIVERSAL;
	public static final boolean _TAG_PRIMITIVE = true;
	
	
	//it integer, but two different tags denotate this.

	//public void setOperationType(OperationCodeType t);
	public OperationCodeType getOperationType();
	
	public void setLocalOperationCode(Long localOperationCode);
	public void setGlobalOperationCode(long[] globalOperationCode);


	public Long getLocalOperationCode();
	public long[] getGlobalOperationCode();

}