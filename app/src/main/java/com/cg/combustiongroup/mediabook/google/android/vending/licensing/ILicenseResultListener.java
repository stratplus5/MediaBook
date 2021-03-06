/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: aidl/ILicenseResultListener.aidl
 */
package com.cg.combustiongroup.mediabook.google.android.vending.licensing;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
public interface ILicenseResultListener extends IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends Binder implements com.cg.combustiongroup.mediabook.google.android.vending.licensing.ILicenseResultListener
{
private static final String DESCRIPTOR = "com.android.vending.licensing.ILicenseResultListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an ILicenseResultListener interface,
 * generating a proxy if needed.
 */
public static com.cg.combustiongroup.mediabook.google.android.vending.licensing.ILicenseResultListener asInterface(IBinder obj)
{
if ((obj==null)) {
return null;
}
IInterface iin = (IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.cg.combustiongroup.mediabook.google.android.vending.licensing.ILicenseResultListener))) {
return ((com.cg.combustiongroup.mediabook.google.android.vending.licensing.ILicenseResultListener)iin);
}
return new com.cg.combustiongroup.mediabook.google.android.vending.licensing.ILicenseResultListener.Stub.Proxy(obj);
}
public IBinder asBinder()
{
return this;
}
public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_verifyLicense:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
String _arg1;
_arg1 = data.readString();
String _arg2;
_arg2 = data.readString();
this.verifyLicense(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.cg.combustiongroup.mediabook.google.android.vending.licensing.ILicenseResultListener
{
private IBinder mRemote;
Proxy(IBinder remote)
{
mRemote = remote;
}
public IBinder asBinder()
{
return mRemote;
}
public String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public void verifyLicense(int responseCode, String signedData, String signature) throws RemoteException
{
Parcel _data = Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(responseCode);
_data.writeString(signedData);
_data.writeString(signature);
mRemote.transact(Stub.TRANSACTION_verifyLicense, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_verifyLicense = (IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void verifyLicense(int responseCode, String signedData, String signature) throws RemoteException;
}
