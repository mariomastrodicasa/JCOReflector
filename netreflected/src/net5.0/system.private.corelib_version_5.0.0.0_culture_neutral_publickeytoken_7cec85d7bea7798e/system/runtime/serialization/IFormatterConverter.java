/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.runtime.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.SByte;
import system.Single;
import system.DateTime;
import system.Decimal;
import system.TypeCode;
import system.UInt16;
import system.UInt32;
import system.UInt64;


/**
 * The base .NET class managing System.Runtime.Serialization.IFormatterConverter, System.Private.CoreLib, Version=5.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Serialization.IFormatterConverter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Serialization.IFormatterConverter</a>
 */
public interface IFormatterConverter extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=5.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=5.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Runtime.Serialization.IFormatterConverter
     */
    public static final String className = "System.Runtime.Serialization.IFormatterConverter";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IFormatterConverter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IFormatterConverter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IFormatterConverter ToIFormatterConverter(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.Private.CoreLib, Version=5.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IFormatterConverterImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link Object} representing the instance of the instantiated Class
     */
    public Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public boolean ToBoolean(NetObject value) throws Throwable;

    public byte ToByte(NetObject value) throws Throwable;

    public char ToChar(NetObject value) throws Throwable;

    public double ToDouble(NetObject value) throws Throwable;

    public short ToInt16(NetObject value) throws Throwable;

    public int ToInt32(NetObject value) throws Throwable;

    public long ToInt64(NetObject value) throws Throwable;

    public SByte ToSByte(NetObject value) throws Throwable;

    public Single ToSingle(NetObject value) throws Throwable;

    public DateTime ToDateTime(NetObject value) throws Throwable;

    public Decimal ToDecimal(NetObject value) throws Throwable;

    public NetObject Convert(NetObject value, NetType type) throws Throwable;

    public NetObject Convert(NetObject value, TypeCode typeCode) throws Throwable;

    public java.lang.String ToString(NetObject value) throws Throwable;

    public UInt16 ToUInt16(NetObject value) throws Throwable;

    public UInt32 ToUInt32(NetObject value) throws Throwable;

    public UInt64 ToUInt64(NetObject value) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}