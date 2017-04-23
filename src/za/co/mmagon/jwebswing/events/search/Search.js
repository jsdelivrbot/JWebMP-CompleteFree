JW_APP_NAME.directive('ngSearch', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngSearch);
            element.on('search', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 