/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package lcmtypes;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class dynamixel_status_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public int error_flags;
    public double position_radians;
    public double speed;
    public double load;
    public double voltage;
    public double temperature;
 
    public dynamixel_status_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x73954bff708517ffL;
 
    public static final int ERROR_VOLTAGE = 1;
    public static final int ERROR_ANGLE_LIMIT = 2;
    public static final int ERROR_OVERHEAT = 4;
    public static final int ERROR_OVERLOAD = 32;

    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(lcmtypes.dynamixel_status_t.class))
            return 0L;
 
        classes.add(lcmtypes.dynamixel_status_t.class);
        long hash = LCM_FINGERPRINT_BASE
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        outs.writeLong(this.utime); 
 
        outs.writeInt(this.error_flags); 
 
        outs.writeDouble(this.position_radians); 
 
        outs.writeDouble(this.speed); 
 
        outs.writeDouble(this.load); 
 
        outs.writeDouble(this.voltage); 
 
        outs.writeDouble(this.temperature); 
 
    }
 
    public dynamixel_status_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public dynamixel_status_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static lcmtypes.dynamixel_status_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        lcmtypes.dynamixel_status_t o = new lcmtypes.dynamixel_status_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.error_flags = ins.readInt();
 
        this.position_radians = ins.readDouble();
 
        this.speed = ins.readDouble();
 
        this.load = ins.readDouble();
 
        this.voltage = ins.readDouble();
 
        this.temperature = ins.readDouble();
 
    }
 
    public lcmtypes.dynamixel_status_t copy()
    {
        lcmtypes.dynamixel_status_t outobj = new lcmtypes.dynamixel_status_t();
        outobj.utime = this.utime;
 
        outobj.error_flags = this.error_flags;
 
        outobj.position_radians = this.position_radians;
 
        outobj.speed = this.speed;
 
        outobj.load = this.load;
 
        outobj.voltage = this.voltage;
 
        outobj.temperature = this.temperature;
 
        return outobj;
    }
 
}

