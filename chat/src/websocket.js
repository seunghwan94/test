let ws;
export const getWebSocket = () => {
  if(!ws || ws.readyState === WebSocket.CLOSED){
    ws = new WebSocket("ws://localhost:8080/chat");
  }
  return ws;
}