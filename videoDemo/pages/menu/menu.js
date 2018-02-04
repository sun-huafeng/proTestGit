Page({
  data: {
  },
  goPhoto: function () {
    var that = this
    wx.navigateTo({
      url: '../photo/photo'
    })
  },
  goVideo: function () {
    var that = this
    wx.navigateTo({
      url: '../video/video'
    })
  }
})