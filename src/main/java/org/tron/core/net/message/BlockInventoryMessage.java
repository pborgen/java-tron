package org.tron.core.net.message;

import io.scalecube.cluster.Member;
import org.tron.protos.Protocal;

public class BlockInventoryMessage extends InventoryOfPeerMessage {

  public BlockInventoryMessage(byte[] packed, Member peer) {
    super(packed, peer);
  }

  public BlockInventoryMessage(Protocal.Inventory inv, Member peer) {
    super(inv, peer);
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public MessageTypes getType() {
    return MessageTypes.BLOCK_INVENTORY;
  }


}
